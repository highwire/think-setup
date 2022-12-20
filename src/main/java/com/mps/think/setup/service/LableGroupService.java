package com.mps.think.setup.service;

import java.util.List;


import com.mps.think.setup.model.LableGroup;
import com.mps.think.setup.vo.LableGroupVO;

public interface LableGroupService {

	public List<LableGroup> findAllLableGroupt();

	public LableGroupVO saveLableGroup(LableGroupVO lableGroup);

	public LableGroupVO updateLableGroup(LableGroupVO lableGroup);

	public LableGroup findbyLableGroup(Integer lableGroupId);
	
	public LableGroup deleteByLableGroupId(Integer lableGroupId);

}
