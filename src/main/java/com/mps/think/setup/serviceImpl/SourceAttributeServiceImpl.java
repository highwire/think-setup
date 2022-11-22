package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.SourceAttribute;
import com.mps.think.setup.repo.SourceAttributeRepo;
import com.mps.think.setup.service.SourceAttributeService;
import com.mps.think.setup.vo.SourceAttributeVo;

@Service
public class SourceAttributeServiceImpl implements SourceAttributeService {

	@Autowired
	SourceAttributeRepo sourceAttributeRepo;

	@Override
	public List<SourceAttribute> findAllSourceAttribute() {
		return sourceAttributeRepo.findAll();
	}

	@Override
	public SourceAttributeVo saveSourceAttribute(SourceAttributeVo sourceAttributeVo) {
		SourceAttribute sourceAttribute = new SourceAttribute();
		sourceAttribute.setSourceAttribute(sourceAttributeVo.getSourceAttribute());
		sourceAttribute.setDescription(sourceAttributeVo.getDescription());
		sourceAttribute.setWidth(sourceAttributeVo.getWidth());
		sourceAttribute = sourceAttributeRepo.save(sourceAttribute);
		sourceAttributeVo.setId(sourceAttribute.getId());
		return sourceAttributeVo;
	}

	@Override
	public SourceAttributeVo updateSourceAttribute(SourceAttributeVo sourceAttributeVo) {
		SourceAttribute sourceAttribute = new SourceAttribute();
		sourceAttribute.setId(sourceAttributeVo.getId());
		sourceAttribute.setSourceAttribute(sourceAttributeVo.getSourceAttribute());
		sourceAttribute.setDescription(sourceAttributeVo.getDescription());
		sourceAttribute.setWidth(sourceAttributeVo.getWidth());
		sourceAttribute = sourceAttributeRepo.save(sourceAttribute);
		return sourceAttributeVo;
	}

	@Override
	public SourceAttribute findbySourceAttributeId(Integer sourceAttributeId) {
		return sourceAttributeRepo.findById(sourceAttributeId).get();
	}

}
