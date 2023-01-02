package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.ParentClass;
import com.mps.think.setup.vo.ParentClassVO;

public interface ParentClassService {
	

	public List<ParentClass> findAllParentClass();
	
	public ParentClassVO saveParentClass(ParentClassVO parentClassVO);
	
	public ParentClassVO updateParentClass(ParentClassVO parentClassVO);
	
	public ParentClass findbyParentClassId(Integer parentClassId);
	
//	public ParentClass findByParentId(Integer parentId);

}
