package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.SourceAttribute;
import com.mps.think.setup.model.SourceAttributeValue;
import com.mps.think.setup.repo.SourceAttributeValueRepo;
import com.mps.think.setup.service.SourceAttributeValueService;
import com.mps.think.setup.vo.SourceAttributeValueVo;
@Service
public class SourceAttributeValueServiceImpl implements SourceAttributeValueService {

	@Autowired
	SourceAttributeValueRepo sourceAttributeValueRepo;
	@Override
	public List<SourceAttributeValue> findAllSourceAttributeValue() {
		return sourceAttributeValueRepo.findAll();
	}

	@Override
	public SourceAttributeValueVo saveSourceAttributeValue(SourceAttributeValueVo sourceAttributeValueVo) {
		SourceAttributeValue sourceAttributeValue = new SourceAttributeValue();
		sourceAttributeValue.setDescription(sourceAttributeValueVo.getDescription());
		sourceAttributeValue.setSourceAttributeValue(sourceAttributeValueVo.getSourceAttributeValue());
		SourceAttribute sourceAttribute= new SourceAttribute();
		sourceAttribute.setId(sourceAttributeValueVo.getSourceAttribute().getId());
		sourceAttributeValue.setSourceAttribute(sourceAttribute);
		sourceAttributeValue= sourceAttributeValueRepo.save(sourceAttributeValue);
		sourceAttributeValueVo.setId(sourceAttributeValue.getId());
		return sourceAttributeValueVo;
	}

	@Override
	public SourceAttributeValueVo updateSourceAttributeValue(SourceAttributeValueVo sourceAttributeValueVo) {
		SourceAttributeValue sourceAttributeValue = new SourceAttributeValue();
		sourceAttributeValue.setId(sourceAttributeValueVo.getId());
		sourceAttributeValue.setDescription(sourceAttributeValueVo.getDescription());
		sourceAttributeValue.setSourceAttributeValue(sourceAttributeValueVo.getSourceAttributeValue());
		SourceAttribute sourceAttribute= new SourceAttribute();
		sourceAttribute.setId(sourceAttributeValueVo.getSourceAttribute().getId());
		sourceAttributeValue.setSourceAttribute(sourceAttribute);
		sourceAttributeValue= sourceAttributeValueRepo.save(sourceAttributeValue);
		sourceAttributeValueVo.setId(sourceAttributeValue.getId());
		return sourceAttributeValueVo;
	}

	@Override
	public SourceAttributeValue findbySourceAttributeValueId(Integer sourceAttributeValueId) {
		return sourceAttributeValueRepo.findById(sourceAttributeValueId).get();
	}

	
}
