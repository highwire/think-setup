package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.SourceAttributeValue;
import com.mps.think.setup.vo.SourceAttributeValueVo;

public interface SourceAttributeValueService {

	public List<SourceAttributeValue> findAllSourceAttributeValue();

	public SourceAttributeValueVo saveSourceAttributeValue(SourceAttributeValueVo sourceAttributeValueVo);

	public SourceAttributeValueVo updateSourceAttributeValue(SourceAttributeValueVo sourceAttributeValueVo);

	public SourceAttributeValue findbySourceAttributeValueId(Integer sourceAttributeValueId);

}
