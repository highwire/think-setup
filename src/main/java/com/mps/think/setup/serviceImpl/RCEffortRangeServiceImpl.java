package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.RCEffortRange;
import com.mps.think.setup.model.RenewalCard;
import com.mps.think.setup.repo.RCEffortRangeRepo;
import com.mps.think.setup.service.RCEffortRangeService;
import com.mps.think.setup.vo.RCEffortRangeVO;
@Service
public class RCEffortRangeServiceImpl implements RCEffortRangeService{

	@Autowired
	RCEffortRangeRepo effortRangeRepo;
	
	@Override
	public List<RCEffortRange> findAllRCEffortRange() {
		return effortRangeRepo.findAll();
	}

	@Override
	public RCEffortRangeVO saveRCEffortRange(RCEffortRangeVO effortRangeVO) {
		RCEffortRange data=new RCEffortRange();
		RenewalCard rce=new RenewalCard();
		rce.setRenewalCardId(effortRangeVO.getRenewalCardId().getRenewalCardId());
		data.setRenewalCardId(rce);
		data.setEffortFrom(effortRangeVO.getEffortFrom());
		data.setEffortTo(effortRangeVO.getEffortTo());
		effortRangeRepo.saveAndFlush(data);
		data.setId(data.getId());
		return effortRangeVO;
	}

	@Override
	public RCEffortRangeVO updateRCEffortRange(RCEffortRangeVO effortRangeVO) {
		RCEffortRange effortRange=effortRangeRepo.findById(effortRangeVO.getId()).get();
		RenewalCard renewalCard=new RenewalCard();
		renewalCard.setRenewalCardId(effortRangeVO.getRenewalCardId().getRenewalCardId());
		effortRange.setRenewalCardId(renewalCard);
		effortRange.setEffortFrom(effortRangeVO.getEffortFrom());
		effortRange.setEffortTo(effortRangeVO.getEffortTo());
		effortRange=effortRangeRepo.saveAndFlush(effortRange);
		return effortRangeVO;
	}

	@Override
	public RCEffortRange deleteRCEffortRange(Integer rcEffortRangeId) {
		RCEffortRange effortRange=effortRangeRepo.findById(rcEffortRangeId).get();
		effortRangeRepo.deleteById(rcEffortRangeId);
		return effortRange;
	}

	@Override
	public RCEffortRange findbyRCEffortRangeId(Integer rcEffortRangeId) {
		Optional<RCEffortRange> details=effortRangeRepo.findById(rcEffortRangeId);
		return details.get();
	}

}
