package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.LableFormat;
import com.mps.think.setup.model.LableFormatGroups;
import com.mps.think.setup.model.LableGroup;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.repo.LableFormatGroupsRepo;
import com.mps.think.setup.service.LableFormatGroupsService;
import com.mps.think.setup.vo.LableFormatGroupsVO;

@Service
public class LableFormatGroupsServiceImp implements LableFormatGroupsService {

	@Autowired
	LableFormatGroupsRepo lableFormatGroupsRepo;

	@Override
	public List<LableFormatGroups> findAllLableFormatGroups() {
		return lableFormatGroupsRepo.findAll();
	}

	@Override
	public LableFormatGroupsVO saveLableFormatGroups(LableFormatGroupsVO lableFormatGroupsVO) {
		LableFormatGroups lableFormatGroups = new LableFormatGroups();
		lableFormatGroups.setDescription(lableFormatGroupsVO.getDescription());
		LableFormat lableFormat = new LableFormat();
		lableFormat.setLableFormatId(lableFormatGroupsVO.getLableFormatVo().getLableFormatId());
		lableFormatGroups.setLableFormat(lableFormat);
		LableGroup lableGroup = new LableGroup();
		lableGroup.setLableGroupId(lableFormatGroupsVO.getLablegroupVo().getLableGroupId());
		lableFormatGroups.setLablegroup(lableGroup);
		Publisher publisher = new Publisher();
		publisher.setId(lableFormatGroupsVO.getPubId().getId());
		lableFormatGroupsVO.setPubId(publisher);
		lableFormatGroups = lableFormatGroupsRepo.save(lableFormatGroups);
		lableFormatGroupsVO.setLableFormatGroupId(lableFormatGroups.getLableFormatGroupId());
		return lableFormatGroupsVO;
	}

	@Override
	public LableFormatGroupsVO updateLableFormatGroups(LableFormatGroupsVO lableFormatGroupsVO) {
		LableFormatGroups lableFormatGroups = new LableFormatGroups();
		lableFormatGroups.setLableFormatGroupId(lableFormatGroupsVO.getLableFormatGroupId());
		lableFormatGroups.setDescription(lableFormatGroupsVO.getDescription());
		LableFormat lableFormat = new LableFormat();
		lableFormat.setLableFormatId(lableFormatGroupsVO.getLableFormatVo().getLableFormatId());
		lableFormatGroups.setLableFormat(lableFormat);
		LableGroup lableGroup = new LableGroup();
		lableGroup.setLableGroupId(lableFormatGroupsVO.getLablegroupVo().getLableGroupId());
		lableFormatGroups.setLablegroup(lableGroup);
		Publisher publisher = new Publisher();
		publisher.setId(lableFormatGroupsVO.getPubId().getId());
		lableFormatGroupsVO.setPubId(publisher);
		lableFormatGroups = lableFormatGroupsRepo.save(lableFormatGroups);
		return lableFormatGroupsVO;
	}

	@Override
	public LableFormatGroups findbyLableFormatGroups(Integer lableFormatId) {
		return lableFormatGroupsRepo.findById(lableFormatId).get();
	}

}
