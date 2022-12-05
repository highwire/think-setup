package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.LableFormat;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.repo.LableFormatRepo;
import com.mps.think.setup.service.LableFormatService;
import com.mps.think.setup.vo.LableFormatVO;

@Service
public class LableFormatServiceImp implements LableFormatService {

	@Autowired
	LableFormatRepo lableFormatRepo;

	@Override
	public List<LableFormat> findAllLableFormat() {
		return lableFormatRepo.findAll();
	}

	@Override
	public LableFormatVO saveLableFormat(LableFormatVO lableFormatVO) {
		LableFormat lableFormat = new LableFormat();
		lableFormat.setDescription(lableFormatVO.getDescription());
		lableFormat.setLableFormat(lableFormatVO.getLableFormat());
		Publisher publisher = new Publisher();
		publisher.setId(lableFormatVO.getPubId().getId());
		lableFormat.setPubId(publisher);
		lableFormat = lableFormatRepo.save(lableFormat);
		lableFormatVO.setLableFormatId(lableFormat.getLableFormatId());
		return lableFormatVO;
	}

	@Override
	public LableFormatVO updateLableFormat(LableFormatVO lableFormatVO) {
		LableFormat lableFormat = new LableFormat();
		lableFormat.setLableFormatId(lableFormatVO.getLableFormatId());
		lableFormat.setDescription(lableFormatVO.getDescription());
		lableFormat.setLableFormat(lableFormatVO.getLableFormat());
		Publisher publisher = new Publisher();
		publisher.setId(lableFormatVO.getPubId().getId());
		lableFormat.setPubId(publisher);
		lableFormat = lableFormatRepo.save(lableFormat);
		return lableFormatVO;
	}

	@Override
	public LableFormat findbyLableFormat(Integer lableFormatId) {
		return lableFormatRepo.findById(lableFormatId).get();
	}

}
