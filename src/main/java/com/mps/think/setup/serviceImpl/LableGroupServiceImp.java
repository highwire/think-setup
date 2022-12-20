package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.LableGroup;
import com.mps.think.setup.model.Publisher;
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
	public LableGroupVO saveLableGroup(LableGroupVO lableGroupVo) {
		LableGroup lableGroup= new LableGroup();
		lableGroup.setDescription(lableGroupVo.getDescription());
		lableGroup.setLableGroups(lableGroupVo.getLableGroups());
		Publisher publisher = new Publisher();
		publisher.setId(lableGroupVo.getPubId().getId());
		lableGroup.setPubId(publisher);
		lableGroup = lableGroupRepo.save(lableGroup);
		lableGroupVo.setLableGroupId(lableGroup.getLableGroupId());
		return lableGroupVo;
	}

	@Override
	public LableGroupVO updateLableGroup(LableGroupVO lableGroupVo) {
		LableGroup lableGroup= new LableGroup();
		lableGroup.setLableGroupId(lableGroupVo.getLableGroupId());
		lableGroup.setDescription(lableGroupVo.getDescription());
		lableGroup.setLableGroups(lableGroupVo.getLableGroups());
		Publisher publisher = new Publisher();
		publisher.setId(lableGroupVo.getPubId().getId());
		lableGroup.setPubId(publisher);
		lableGroup = lableGroupRepo.save(lableGroup);
		return lableGroupVo;
	}

	@Override
	public LableGroup findbyLableGroup(Integer lableGroupId) {
		return lableGroupRepo.findById(lableGroupId).get();
	}

	@Override
	public LableGroup deleteByLableGroupId(Integer lableGroupId) {
		LableGroup delete = findbyLableGroup(lableGroupId);
		lableGroupRepo.delete(delete);
		return delete;
	}

}
