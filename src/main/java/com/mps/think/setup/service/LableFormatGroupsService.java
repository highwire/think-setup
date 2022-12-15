package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.LableFormatGroups;
import com.mps.think.setup.vo.LableFormatGroupsVO;

public interface LableFormatGroupsService {

	public List<LableFormatGroups> findAllLableFormatGroups();

	public LableFormatGroupsVO saveLableFormatGroups(LableFormatGroupsVO lableFormatGroups);

	public LableFormatGroupsVO updateLableFormatGroups(LableFormatGroupsVO lableFormatGroups);

	public LableFormatGroups findbyLableFormatGroups(Integer lableFormatId);

}
