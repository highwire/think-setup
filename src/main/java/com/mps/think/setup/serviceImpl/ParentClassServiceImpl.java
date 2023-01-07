package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.OrderClass;
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
		OrderClass oc=new OrderClass();
		oc.setOcId(parentClassVO.getOcId().getOcId());
		data.setOcId(oc);
		parentClassRepo.saveAndFlush(data);
		parentClassVO.setParentID(data.getParentID());
		return parentClassVO;
		
	}

	@Override
	public ParentClassVO updateParentClass(ParentClassVO parentClassVO) {
		ParentClass data=new ParentClass();
		data.setParentID(parentClassVO.getParentID());
		data.setParentName(parentClassVO.getParentName());
		OrderClass oc=new OrderClass();
		oc.setOcId(parentClassVO.getOcId().getOcId());
		data.setOcId(oc);
		parentClassRepo.saveAndFlush(data);
		return parentClassVO;
	}

	@Override
	public ParentClass findbyParentClassId(Integer parentClassId) {
		ParentClass details=parentClassRepo.findById(parentClassId).get();
		return details;
	}

//	@Override
//	public ParentClass findByParentId(Integer parentId) {
//
//		ParentClass data=parentClassRepo.findByParentId(parentId);
//		
//		return data;
//	}
	
	
}
