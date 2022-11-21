package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import com.mps.think.setup.model.CreditStatus;
import com.mps.think.setup.model.ProfitCenter;
import com.mps.think.setup.repo.ProfitCenterRepo;
import com.mps.think.setup.service.ProfitCenterService;
import com.mps.think.setup.vo.ProfitCenterVO;

@Service
public class ProfitCenterServiceImpl implements ProfitCenterService {

	@Autowired
	ProfitCenterRepo profitCenterRepo;

	@Override
	public List<ProfitCenter> findAllcreditStatus() {
		List<ProfitCenter> profitCenterList = profitCenterRepo.findAll();
		if (profitCenterList.isEmpty()) {
			throw new NotFoundException("No Profit Center data present, please add Profit Center!");
		}
		return profitCenterList;
	}

	@Override
	public ProfitCenterVO savecreditStatus(ProfitCenterVO profitCenterVo) {
		ProfitCenter profitCenter = new ProfitCenter();
		profitCenter.setProfitDescription(profitCenterVo.getProfitDescription());
		profitCenter.setInclComAr(profitCenterVo.getInclComAr());
		profitCenter.setInclComLiab(profitCenterVo.getInclComLiab());
		profitCenter.setInclDelAr(profitCenterVo.getInclDelAr());
		profitCenter.setInclDelLiab(profitCenterVo.getInclDelLiab());
		profitCenter.setInclTaxAr(profitCenterVo.getInclTaxAr());
		profitCenter.setInclTaxLiab(profitCenterVo.getInclTaxLiab());
		profitCenter = profitCenterRepo.saveAndFlush(profitCenter);
		profitCenterVo.setProftId(profitCenter.getProftId());
		return profitCenterVo;
	}

	@Override
	public ProfitCenterVO updatecreditStatus(ProfitCenterVO profitCenterVo) {
		ProfitCenter profitCenter = new ProfitCenter();
		profitCenter.setProftId(profitCenterVo.getProftId());
		profitCenter.setProfitDescription(profitCenterVo.getProfitDescription());
		profitCenter.setInclComAr(profitCenterVo.getInclComAr());
		profitCenter.setInclComLiab(profitCenterVo.getInclComLiab());
		profitCenter.setInclDelAr(profitCenterVo.getInclDelAr());
		profitCenter.setInclDelLiab(profitCenterVo.getInclDelLiab());
		profitCenter.setInclTaxAr(profitCenterVo.getInclTaxAr());
		profitCenter.setInclTaxLiab(profitCenterVo.getInclTaxLiab());
		profitCenter = profitCenterRepo.saveAndFlush(profitCenter);
		return profitCenterVo;
	}

	@Override
	public ProfitCenter findbycreditId(Integer creditId) {
		Optional<ProfitCenter> cs =profitCenterRepo.findById(creditId);
		if(!cs.isPresent()) {
			throw new NotFoundException("Profit Center Id : "+creditId+" does not exist!");
		}
		return cs.get();
	}

}
