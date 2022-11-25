package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.SourceAttribute;
import com.mps.think.setup.model.SourceFormat;
import com.mps.think.setup.model.SourceFormatSegment;
import com.mps.think.setup.repo.SourceFormatSegmentRepo;
import com.mps.think.setup.service.SourceFormatSegmentService;
import com.mps.think.setup.vo.SourceFormatSegmentVo;

@Service
public class SourceFormatSegmentServiceImpl implements SourceFormatSegmentService {

	@Autowired
	SourceFormatSegmentRepo sourceFormatSegmentRepo;

	@Override
	public List<SourceFormatSegment> findAllSourceFormatSegment() {
		return sourceFormatSegmentRepo.findAll();
	}

	@Override
	public SourceFormatSegmentVo saveSourceFormatSegment(SourceFormatSegmentVo sourceFormatSegmentVo) {

		SourceFormatSegment SourceFormatSegment = new SourceFormatSegment();
		SourceFormatSegment.setFixedValue(sourceFormatSegmentVo.getFixedValue());
		SourceFormatSegment.setGenerationFunction(sourceFormatSegmentVo.getGenerationFunction());
		SourceFormatSegment.setGenerationMethod(sourceFormatSegmentVo.getGenerationMethod());
		SourceFormatSegment.setGenFuncParm(sourceFormatSegmentVo.getGenFuncParm());
		SourceAttribute SourceAttribute = new SourceAttribute();
		SourceAttribute.setId(sourceFormatSegmentVo.getSourceAttribute().getId());
		SourceFormatSegment.setSourceAttribute(SourceAttribute);
		SourceFormat SourceFormat = new SourceFormat();
		SourceFormat.setId(sourceFormatSegmentVo.getSourceFormatVo().getId());
		SourceFormatSegment.setSourceFormat(SourceFormat);
		SourceFormatSegment = sourceFormatSegmentRepo.save(SourceFormatSegment);
		sourceFormatSegmentVo.setId(SourceFormatSegment.getId());
		return sourceFormatSegmentVo;
	}

	@Override
	public SourceFormatSegmentVo updateSourceFormatSegment(SourceFormatSegmentVo sourceFormatSegmentVo) {

		SourceFormatSegment SourceFormatSegment = new SourceFormatSegment();
		SourceFormatSegment.setId(sourceFormatSegmentVo.getId());
		SourceFormatSegment.setFixedValue(sourceFormatSegmentVo.getFixedValue());
		SourceFormatSegment.setGenerationFunction(sourceFormatSegmentVo.getGenerationFunction());
		SourceFormatSegment.setGenerationMethod(sourceFormatSegmentVo.getGenerationMethod());
		SourceFormatSegment.setGenFuncParm(sourceFormatSegmentVo.getGenFuncParm());
		SourceAttribute SourceAttribute = new SourceAttribute();
		SourceAttribute.setId(sourceFormatSegmentVo.getSourceAttribute().getId());
		SourceFormatSegment.setSourceAttribute(SourceAttribute);
		SourceFormat SourceFormat = new SourceFormat();
		SourceFormat.setId(sourceFormatSegmentVo.getSourceFormatVo().getId());
		SourceFormatSegment.setSourceFormat(SourceFormat);
		SourceFormatSegment = sourceFormatSegmentRepo.save(SourceFormatSegment);
		sourceFormatSegmentVo.setId(SourceFormatSegment.getId());
		return sourceFormatSegmentVo;
	}

	@Override
	public SourceFormatSegment findbySourceFormatSegmentId(Integer sourceFormatSegmentId) {
		return sourceFormatSegmentRepo.findById(sourceFormatSegmentId).get();
	}

}
