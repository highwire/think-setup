package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.LableKeyLine;
import com.mps.think.setup.repo.LableKeyLineRepo;
import com.mps.think.setup.service.LableKeyLineService;
import com.mps.think.setup.vo.LableKeyLineVO;

@Service
public class LableKeyLineServiceImpl implements LableKeyLineService {

	@Autowired
	LableKeyLineRepo lableKeyLineRepo;

	@Override
	public List<LableKeyLine> findAllLableKeyLine() {
		return lableKeyLineRepo.findAll();
	}

	@Override
	public LableKeyLineVO saveLableKeyLine(LableKeyLineVO lableKeyLine) {
		return lableKeyLine;
	}

	@Override
	public LableKeyLineVO updateLableKeyLine(LableKeyLineVO lableKeyLine) {
		return lableKeyLine;
	}

	@Override
	public LableKeyLine findbyLableKeyLine(Integer lableKeyLineId) {
		return lableKeyLineRepo.findById(lableKeyLineId).get();
	}

}
