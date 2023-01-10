package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.LableKeyLine;
import com.mps.think.setup.model.Publisher;
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
	public LableKeyLineVO saveLableKeyLine(LableKeyLineVO lableKeyLineVo) {
		LableKeyLine lableKeyLine = new LableKeyLine();
		lableKeyLine.setDescription(lableKeyLineVo.getDescription());
		lableKeyLine.setLabelKeyline(lableKeyLineVo.getLabelKeyline());
		lableKeyLine.setSuppressflag(lableKeyLineVo.isSuppressflag());
		lableKeyLine.setCurrentIssue(lableKeyLineVo.getCurrentIssue());
		lableKeyLine.setCurrentVolume(lableKeyLineVo.getCurrentVolume());
		lableKeyLine.setText(lableKeyLineVo.getText());
		Publisher publisher = new Publisher();
		publisher.setId(lableKeyLineVo.getPubId().getId());
		lableKeyLine.setPubId(publisher);
		lableKeyLine = lableKeyLineRepo.save(lableKeyLine);
		lableKeyLineVo.setLableKeylineId(lableKeyLine.getLableKeylineId());
		return lableKeyLineVo;
	}

	@Override
	public LableKeyLineVO updateLableKeyLine(LableKeyLineVO lableKeyLineVo) {
		LableKeyLine lableKeyLine = new LableKeyLine();
		lableKeyLine.setLableKeylineId(lableKeyLineVo.getLableKeylineId());
		lableKeyLine.setDescription(lableKeyLineVo.getDescription());
		lableKeyLine.setLabelKeyline(lableKeyLineVo.getLabelKeyline());
		lableKeyLine.setSuppressflag(lableKeyLineVo.isSuppressflag());
		lableKeyLine.setCurrentIssue(lableKeyLineVo.getCurrentIssue());
		lableKeyLine.setCurrentVolume(lableKeyLineVo.getCurrentVolume());
		lableKeyLine.setText(lableKeyLineVo.getText());
		Publisher publisher = new Publisher();
		publisher.setId(lableKeyLineVo.getPubId().getId());
		lableKeyLine.setPubId(publisher);
		lableKeyLine = lableKeyLineRepo.save(lableKeyLine);
		return lableKeyLineVo;
	}

	@Override
	public LableKeyLine findbyLableKeyLine(Integer lableKeyLineId) {
		return lableKeyLineRepo.findById(lableKeyLineId).get();
	}

	@Override
	public LableKeyLine deleteByLableKeyLineId(Integer lableKeyLineId) {
		LableKeyLine delete = findbyLableKeyLine(lableKeyLineId);
		lableKeyLineRepo.delete(delete);
		return delete;
	}

}
