package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;
import java.util.Optional;

import com.mps.think.setup.model.ParentClass;
import com.mps.think.setup.model.RateCards;
import com.mps.think.setup.repo.RateCardsRepo;
import com.mps.think.setup.service.RateCardsService;
import com.mps.think.setup.vo.RateCardsVO;

@Service
public class RateCardsServiceImpl implements RateCardsService {
	
	@Autowired
	RateCardsRepo rateCardsRepo;

	@Override
	public List<RateCards> findAllRateCards() {
		List<RateCards> rcList = rateCardsRepo.findAll();
		if (rcList.isEmpty()) {
			throw new NotFoundException("No RateCards present, please add RateCards!");
		}
		return rcList;
	}

	@Override
	public RateCardsVO saveRateCards(RateCardsVO rateCards) {
		RateCards rc = new RateCards();
		rc.setRateCard(rateCards.getRateCard());
		rc.setDescription(rateCards.getDescription());
		rc.setOrderClasses(rateCards.getOrderClasses());
		rc.setRateClassEffectiveSequence(rateCards.getRateClassEffectiveSequence());
		rc.setRateClassId(rateCards.getRateClassId());
		rc.setUseForPackage(rateCards.getUseForPackage());
		rateCards.setRcId(rc.getRcId());
		ParentClass parentClass=new ParentClass();
		parentClass.setParentID(rateCards.getParentId().getParentID());
		rc.setParentId(parentClass);
//		publisher.setId(rateCards.getPubId().getId());
//		rc.setPubId(publisher);
		rateCardsRepo.saveAndFlush(rc);
		return rateCards;
	}

	@Override
	public RateCardsVO updateRateCards(RateCardsVO rateCards) {
		RateCards rc = findbyrcId(rateCards.getRcId());
		rc.setRateCard(rateCards.getRateCard());
		rc.setDescription(rateCards.getDescription());
		rc.setOrderClasses(rateCards.getOrderClasses());
		rc.setRateClassEffectiveSequence(rateCards.getRateClassEffectiveSequence());
		rc.setRateClassId(rateCards.getRateClassId());
		rc.setUseForPackage(rateCards.getUseForPackage());
		rateCards.setRcId(rc.getRcId());
		ParentClass parentClass=new ParentClass();
		parentClass.setParentID(rateCards.getParentId().getParentID());
		rc.setParentId(parentClass);
//		Publisher publisher=new Publisher();
//		publisher.setId(rateCards.getPubId().getId());
//		rc.setPubId(publisher);
		rateCardsRepo.saveAndFlush(rc);
		return rateCards;
	}

	@Override
	public RateCards findbyrcId(Integer rcId) {
		 Optional<RateCards> rc = rateCardsRepo.findById(rcId);
			if(!rc.isPresent()) {
				throw new NotFoundException("RateCards Id : "+ rcId +" does not exist!");
			}
			return rc.get();
	}

	@Override
	public RateCards deleteByrcId(Integer rcId) {
		RateCards delete = findbyrcId(rcId);
		rateCardsRepo.delete(delete);
		return delete;
	}

}
