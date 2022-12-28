package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.model.RenewalCard;
import com.mps.think.setup.repo.RenewalCardRepo;
import com.mps.think.setup.service.RenewalCardService;
import com.mps.think.setup.vo.RenewalCardVO;

@Service
public class RenewalCardServiceImpl implements RenewalCardService {

	@Autowired
	RenewalCardRepo renewalCardRepo;

	@Override
	public List<RenewalCard> findAllRenewalCard() {
		return renewalCardRepo.findAll();
	}

	@Override
	public RenewalCardVO saveRenewalCard(RenewalCardVO renewalCardVO) {
		RenewalCard data = new RenewalCard();
		data.setRenewal_card(renewalCardVO.getRenewalCard());
		data.setDescription(renewalCardVO.getDescription());
		data.setEffortFrom(renewalCardVO.getEffortFrom());
		data.setEffortTo(renewalCardVO.getEffortTo());
		data.setOffersdescription(renewalCardVO.getOffersDescription());
		data.setOrderCodeId(renewalCardVO.getOrderCodeId());
		data.setSourceCodeId(renewalCardVO.getSourceCodeId());
		data.setSubscriptionDefId(renewalCardVO.getSubscriptionDefId());
		data.setPkgDefId(renewalCardVO.getPkgDefId());
		data.setRateClassId(renewalCardVO.getRateClassId());
		data.setDiscountClassId(renewalCardVO.getDiscountClassId());
		data.setParentId(renewalCardVO.getParentId());
		data.setChildId(renewalCardVO.getChildId());
		data.setSubChildId(renewalCardVO.getSubChildId());
		renewalCardRepo.saveAndFlush(data);
		renewalCardVO.setRenewalCardId(data.getRenewalCardId());
		return renewalCardVO;
	}

	@Override
	public RenewalCardVO updateRenewalCard(RenewalCardVO renewalCardVO) {
		RenewalCard data = new RenewalCard();
		data.setRenewalCardId(renewalCardVO.getRenewalCardId());
		data.setRenewal_card(renewalCardVO.getRenewalCard());
		data.setDescription(renewalCardVO.getDescription());
		data.setEffortFrom(renewalCardVO.getEffortFrom());
		data.setEffortTo(renewalCardVO.getEffortTo());
		data.setOffersdescription(renewalCardVO.getOffersDescription());
		data.setOrderCodeId(renewalCardVO.getOrderCodeId());
		data.setSourceCodeId(renewalCardVO.getSourceCodeId());
		data.setSubscriptionDefId(renewalCardVO.getSubscriptionDefId());
		data.setPkgDefId(renewalCardVO.getPkgDefId());
		data.setRateClassId(renewalCardVO.getRateClassId());
		data.setDiscountClassId(renewalCardVO.getDiscountClassId());
		data.setParentId(renewalCardVO.getParentId());
		data.setChildId(renewalCardVO.getChildId());
		data.setSubChildId(renewalCardVO.getSubChildId());
		renewalCardRepo.saveAndFlush(data);
		return renewalCardVO;
	}
		

	@Override
	public RenewalCard findbyRenewalCardId(Integer renewalCardId) {
		Optional<RenewalCard> vo=renewalCardRepo.findById(renewalCardId);
		return vo.get() ;
	}

	@Override
	public RenewalCard deleteRenewalCard(Integer renewalCardId) {
		RenewalCard id= renewalCardRepo.findById(renewalCardId).get();
		renewalCardRepo.deleteById(renewalCardId);
		return id;
	}

}
