package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.SourceFormat;
import com.mps.think.setup.model.SpecialTaxIds;
import com.mps.think.setup.repo.SourceFormatRepo;
import com.mps.think.setup.service.SourceFormatService;
import com.mps.think.setup.vo.SourceFormatVo;
@Service
public class SourceFormatServiceImpl implements SourceFormatService {

	@Autowired
	SourceFormatRepo sourceFormatRepo;
	
	@Override
	public List<SourceFormat> findAllSourceFormat() {
		return sourceFormatRepo.findAll();
	}

	@Override
	public SourceFormatVo saveSourceFormat(SourceFormatVo sourceFormatVo) {
		SourceFormat sourceFormat= new SourceFormat();
		
		sourceFormat.setCodeGenType(sourceFormatVo.getCodeGenType());
		sourceFormat.setDescription(sourceFormatVo.getDescription());
		sourceFormat.setMruSourceFormatSegmentSeq(sourceFormatVo.getMruSourceFormatSegmentSeq());
		sourceFormat.setSourceFormat(sourceFormatVo.getSourceFormat());
		sourceFormat=	sourceFormatRepo.save(sourceFormat);
		sourceFormatVo.setId(sourceFormat.getId());
		return sourceFormatVo;
	}

	@Override
	public SourceFormatVo updateSourceFormat(SourceFormatVo sourceFormatVo) {
		SourceFormat sourceFormat = new SourceFormat();
		sourceFormat.setId(sourceFormatVo.getId());
		sourceFormat.setCodeGenType(sourceFormatVo.getCodeGenType());
		sourceFormat.setDescription(sourceFormatVo.getDescription());
		sourceFormat.setMruSourceFormatSegmentSeq(sourceFormatVo.getMruSourceFormatSegmentSeq());
		sourceFormat.setSourceFormat(sourceFormatVo.getSourceFormat());
		sourceFormat = sourceFormatRepo.save(sourceFormat);
		return sourceFormatVo;
	}

	@Override
	public SourceFormat findbySourceFormatId(Integer SourceFormatId) {
		return sourceFormatRepo.findById(SourceFormatId).get();
	}

	@Override
	public SourceFormat deleteBySourceFormatId(Integer id) {
		SourceFormat delete = findbySourceFormatId(id);
		sourceFormatRepo.delete(delete);
		return delete;
	}

}
