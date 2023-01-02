package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.IssueGeneration;
import com.mps.think.setup.vo.IssueGenerationVo;

public interface IssueGenerationService {

	public List<IssueGeneration> findAllIssueGenerationVo();

	public IssueGenerationVo saveIssueGenerationVo(IssueGenerationVo issueGeneration);

	public IssueGenerationVo updateIssueGenerationVo(IssueGenerationVo issueGeneration);

	public IssueGeneration findbyIssueId(Integer issueId);

}
