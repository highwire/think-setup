package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.LableKeyLine;
import com.mps.think.setup.vo.LableKeyLineVO;

public interface LableKeyLineService {

	public List<LableKeyLine> findAllLableKeyLine();

	public LableKeyLineVO saveLableKeyLine(LableKeyLineVO lableKeyLine);

	public LableKeyLineVO updateLableKeyLine(LableKeyLineVO lableKeyLine);

	public LableKeyLine findbyLableKeyLine(Integer lableKeyLineId);

}
