package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.SubChildClass;
import com.mps.think.setup.vo.SubChildClassVO;

public interface SubChildClassService {

	public List<SubChildClass> findAllSubChildClass();
	
	public SubChildClassVO saveSubChildClass(SubChildClassVO subChildClassVO);
	
	public SubChildClassVO updateSubChildClass(SubChildClassVO subChildClassVO);
	
	public SubChildClass findbySubChildClassId(Integer subChildClassId);
}
