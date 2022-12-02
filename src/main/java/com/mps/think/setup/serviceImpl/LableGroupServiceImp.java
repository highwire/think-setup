package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.LableGroup;
import com.mps.think.setup.repo.LableGroupRepo;
import com.mps.think.setup.service.LableGroupService;
import com.mps.think.setup.vo.LableGroupVO;

@Service
public class LableGroupServiceImp implements LableGroupService {
	@Autowired
	LableGroupRepo lableGroupRepo;

	@Override
	public List<LableGroup> findAllLableGroupt() {
		return lableGroupRepo.findAll();
	}

	@Override
	public LableGroupVO saveLableGroupt(LableGroupVO lableGroup) {
		return lableGroup;
	}

	@Override
	public LableGroupVO updateLableGroup(LableGroupVO lableGroup) {
		return lableGroup;
	}

	@Override
	public LableGroup findbyLableGroup(Integer lableGroupId) {
		return lableGroupRepo.findById(lableGroupId).get();
	}

}
