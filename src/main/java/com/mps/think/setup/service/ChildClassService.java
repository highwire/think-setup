package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.ChildClass;
import com.mps.think.setup.vo.ChildClassVO;
public interface ChildClassService {

	public List<ChildClass> findAllChildClass();
	
	public ChildClassVO saveChildClass(ChildClassVO childClassVO);
	
	public ChildClassVO updateChildClass(ChildClassVO childClassVO);
	
	public ChildClass findbyChildClassId(Integer childClassId);
}
