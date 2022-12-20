package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.ChildClass;
import com.mps.think.setup.model.ParentClass;
import com.mps.think.setup.repo.ChildClassRepo;
import com.mps.think.setup.service.ChildClassService;
import com.mps.think.setup.vo.ChildClassVO;
@Service
public class ChildClassServiceImpl implements ChildClassService {

	@Autowired
	ChildClassRepo childClassRepo;
	
	@Override
	public List<ChildClass> findAllChildClass() {
		return childClassRepo.findAll();
	}

	@Override
	public ChildClassVO saveChildClass(ChildClassVO childClassVO) {
		ChildClass data=new ChildClass();
		data.setChildName(childClassVO.getChildName());
		ParentClass parent=new ParentClass();
		parent.setParentID(childClassVO.getParentId().getParentID());
		data.setParentId(parent);
		childClassRepo.saveAndFlush(data);
		childClassVO.setChildId(data.getChildId());
		return childClassVO;
	}

	@Override
	public ChildClassVO updateChildClass(ChildClassVO childClassVO) {
		ChildClass data=new ChildClass();
		data.setChildId(childClassVO.getChildId());
		data.setChildName(childClassVO.getChildName());
		ParentClass parent=new ParentClass();
		parent.setParentID(childClassVO.getParentId().getParentID());
		data.setParentId(parent);
		childClassRepo.saveAndFlush(data);
		return childClassVO;
	}

	@Override
	public ChildClass findbyChildClassId(Integer childClassId) {
		ChildClass details=childClassRepo.findById(childClassId).get();
		return details;
	}

}
