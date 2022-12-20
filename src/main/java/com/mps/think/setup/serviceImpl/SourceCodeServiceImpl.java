package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import com.mps.think.setup.model.CommodityCodes;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.model.SourceCode;
import com.mps.think.setup.repo.SourceCodeRepo;
import com.mps.think.setup.service.SourceCodeService;
import com.mps.think.setup.vo.SourceCodeVO;

@Service
public class SourceCodeServiceImpl implements SourceCodeService {
	
	@Autowired
	SourceCodeRepo sourceCodeRepo;

	@Override
	public List<SourceCode> findAllSourceCode() {
		List<SourceCode> scList = sourceCodeRepo.findAll();
		if (scList.isEmpty()) {
			throw new NotFoundException("No Source Code present, please add Source Code!");
		}
		return scList;
	}

	@Override
	public SourceCodeVO saveSourceCode(SourceCodeVO sourceCode) {
		SourceCode data = new SourceCode();
		data.setDescription(sourceCode.getDescription());
		data.setOrderCode(sourceCode.getOrderCode());
		data.setOrderCodeType(sourceCode.getOrderCodeType());
		data.setOcId(sourceCode.getOcId());
		data.setIsActive(sourceCode.getIsActive());
//		data.setGenerated(sourceCode.getGenerated());
		data.setGeneric_agency(sourceCode.getGeneric_agency());
		data.setIs_ddp(sourceCode.getIs_ddp());
		data.setSourceCode(sourceCode.getSourceCode());
//		data.setsCodeType(sourceCode.getsCodeType());
		data.setsCodeType(sourceCode.getsCodeType());
		data.setState_Break(sourceCode.getState_Break());
		if (sourceCode.getState_Break()==true) {
			data.setCost(sourceCode.getCost());	
		}
		sourceCode.setSourceCodeId(data.getSourceCodeId());
		Publisher publisher=new Publisher();
		publisher.setId(sourceCode.getPubId().getId());
		data.setPubId(publisher);
		sourceCodeRepo.saveAndFlush(data);
		return sourceCode;
	}

	@Override
	public SourceCode findbySourceCodeId(Integer sourceCodeId) {
		 Optional<SourceCode> cc = sourceCodeRepo.findById(sourceCodeId);
			if(!cc.isPresent()) {
				throw new NotFoundException("Source Code Id : "+ sourceCodeId +" does not exist!");
			}
			return cc.get();
	}

	@Override
	public SourceCodeVO updateSourceCode(SourceCodeVO sourceCode) {
		SourceCode data = new SourceCode();
		data.setSourceCodeId(sourceCode.getSourceCodeId());
		Publisher publisher=new Publisher();
		publisher.setId(sourceCode.getPubId().getId());
		data.setPubId(publisher);
		data.setDescription(sourceCode.getDescription());
		data.setOrderCode(sourceCode.getOrderCode());
		data.setOrderCodeType(sourceCode.getOrderCodeType());
		data.setOcId(sourceCode.getOcId());
		data.setIsActive(sourceCode.getIsActive());
//		data.setGenerated(sourceCode.getGenerated());
		data.setGeneric_agency(sourceCode.getGeneric_agency());
		data.setIs_ddp(sourceCode.getIs_ddp());
		data.setSourceCode(sourceCode.getSourceCode());
		data.setsCodeType(sourceCode.getsCodeType());
		data.setState_Break(sourceCode.getState_Break());
		if (sourceCode.getState_Break()==true) {
			data.setCost(sourceCode.getCost());	
		}
		sourceCodeRepo.saveAndFlush(data);
		return sourceCode;
	}

	@Override
	public SourceCode deleteSourceCodeById(Integer sourceCodeId) {
		SourceCode delete = findbySourceCodeId(sourceCodeId);
		sourceCodeRepo.delete(delete);
		return delete;
	}

	

//	@Override
//	public SourceCodeVO saveSourceCode(SourceCodeVO sourceCode) {
//		SourceCode data = new SourceCode();
//		data.setOcId(sourceCode.getOcId());
//		data.setDescription(sourceCode.getDescription());
//		data.setOrderCode(sourceCode.getOrderCode());
//		data.setOrderCodeType(sourceCode.getOrderCodeType());
//		data.setIsActive(sourceCode.getIsActive());
//		data.setGenerated(sourceCode.getGenerated());
//		data.setGeneric_agency(sourceCode.getGeneric_agency());
//		data.setIs_ddp(sourceCode.getIs_ddp());
//		data.setSourceCode(sourceCode.getSourceCode());
//		data.setsCodeType(sourceCode.getsCodeType());
//		data.setState_Break(sourceCode.getState_Break());
//	    data.setCost(sourceCode.getCost());
//	    sourceCode.setSourceCodeId(data.getSourceCodeId());
//	    Publisher publisher=new Publisher();
//	    publisher.setId(sourceCode.getPubId().getId());
//	    data.setPubId(publisher);
//	    sourceCodeRepo.saveAndFlush(data);
//		return sourceCode;
//	}



}
