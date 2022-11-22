package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.SourceAttribute;
import com.mps.think.setup.vo.SourceAttributeVo;

public interface SourceAttributeService {

	public List<SourceAttribute> findAllSourceAttribute();

	public SourceAttributeVo saveSourceAttribute(SourceAttributeVo surceAttributeVo);

	public SourceAttributeVo updateSourceAttribute(SourceAttributeVo sourceAttributeVo);

	public SourceAttribute findbySourceAttributeId(Integer sourceAttributeId);

}
