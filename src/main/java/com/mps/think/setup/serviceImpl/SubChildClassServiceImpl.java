package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.ChildClass;
import com.mps.think.setup.model.SubChildClass;
import com.mps.think.setup.repo.SubChildClassRepo;
import com.mps.think.setup.service.SubChildClassService;
import com.mps.think.setup.vo.SubChildClassVO;
@Service
public class SubChildClassServiceImpl implements SubChildClassService{
	@Autowired
	SubChildClassRepo subChildClassRepo;

	@Override
	public List<SubChildClass> findAllSubChildClass() {
		return subChildClassRepo.findAll();
	}

	@Override
	public SubChildClassVO saveSubChildClass(SubChildClassVO subChildClassVO) {

		SubChildClass data=new SubChildClass();
		data.setSubChildName(subChildClassVO.getSubChildName());
		ChildClass child=new ChildClass();
		child.setChildId(subChildClassVO.getChildClassId().getChildId());
		data.setChildClassId(child);
		subChildClassRepo.saveAndFlush(data);
		subChildClassVO.setSubChildId(data.getSubChildId());
		return subChildClassVO;
	}

	@Override
	public SubChildClassVO updateSubChildClass(SubChildClassVO subChildClassVO) {
		SubChildClass data=new SubChildClass();
		data.setSubChildId(subChildClassVO.getSubChildId());
		data.setSubChildName(subChildClassVO.getSubChildName());
		ChildClass child=new ChildClass();
		child.setChildId(subChildClassVO.getChildClassId().getChildId());
		data.setChildClassId(child);
		subChildClassRepo.saveAndFlush(data);
		
		return subChildClassVO;
	}

	@Override
	public SubChildClass findbySubChildClassId(Integer subChildClassId) {

		SubChildClass sc=subChildClassRepo.findById(subChildClassId).get();
		return sc;
	}

}
