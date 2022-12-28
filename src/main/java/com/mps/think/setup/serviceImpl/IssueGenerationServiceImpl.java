package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.IssueGeneration;
import com.mps.think.setup.repo.IssueGenerationRepo;
import com.mps.think.setup.service.IssueGenerationService;
import com.mps.think.setup.vo.IssueGenerationVo;

@Service

public class IssueGenerationServiceImpl implements IssueGenerationService {

	@Autowired
	IssueGenerationRepo issueGenerationRepo;

	@Override
	public List<IssueGeneration> findAllIssueGenerationVo() {
		return issueGenerationRepo.findAll();
	}

	@Override
	public IssueGenerationVo saveIssueGenerationVo(IssueGenerationVo issueGeneration) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IssueGenerationVo updateIssueGenerationVo(IssueGenerationVo issueGeneration) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IssueGeneration findbyIssueId(Integer issueId) {
		return issueGenerationRepo.findById(issueId).get();
	}

}
