package com.mps.think.setup.service;

import java.util.List;


import com.mps.think.setup.model.LableFormat;
import com.mps.think.setup.vo.LableFormatVO;

public interface LableFormatService {

	public List<LableFormat> findAllLableFormat();

	public LableFormatVO saveLableFormat(LableFormatVO lableFormat);

	public LableFormatVO updateLableFormat(LableFormatVO lableFormat);

	public LableFormat findbyLableFormat(Integer lableFormatId);
	
	public  LableFormat deleteByLableFormatId(Integer lableFormatId);

}
