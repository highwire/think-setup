package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.ParentClass;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.repo.ParentClassRepo;
import com.mps.think.setup.service.ParentClassService;
import com.mps.think.setup.vo.ParentClassVO;

@Service
public class ParentClassServiceImpl implements ParentClassService{

	@Autowired
	ParentClassRepo parentClassRepo;

	@Override
	public List<ParentClass> findAllParentClass() {
		return parentClassRepo.findAll();
	}

	@Override
	public ParentClassVO saveParentClass(ParentClassVO parentClassVO) {
		ParentClass data=new ParentClass();
		data.setParentName(parentClassVO.getParentName());
//		Publisher pub=new Publisher();
//		pub.setId(parentClassVO.getPubId().getId());
//		data.setPubId(pub);
		parentClassRepo.saveAndFlush(data);
		parentClassVO.setParentID(data.getParentID());
		return parentClassVO;
		
	}

	@Override
	public ParentClassVO updateParentClass(ParentClassVO parentClassVO) {
		ParentClass data=new ParentClass();
		data.setParentID(parentClassVO.getParentID());
		data.setParentName(parentClassVO.getParentName());
//		Publisher pub=new Publisher();
//		pub.setId(parentClassVO.getPubId().getId());
//		data.setPubId(pub);
		parentClassRepo.saveAndFlush(data);
		return parentClassVO;
	}

	@Override
	public ParentClass findbyParentClassId(Integer parentClassId) {
		ParentClass details=parentClassRepo.findById(parentClassId).get();
		return details;
	}
	
	
}
