package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.LableFormat;
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
	public LableFormatVO saveLableFormat(LableFormatVO lableFormat) {
		return lableFormat;
	}

	@Override
	public LableFormatVO updateLableFormat(LableFormatVO lableFormat) {
		return lableFormat;
	}

	@Override
	public LableFormat findbyLableFormat(Integer lableFormatId) {
		return lableFormatRepo.findById(lableFormatId).get();
	}

}
