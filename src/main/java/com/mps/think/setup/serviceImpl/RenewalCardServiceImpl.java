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
		Publisher publisher = new Publisher();
		publisher.setId(renewalCardVO.getPubId().getId());
		data.setPubId(publisher);
		data.setOcId(renewalCardVO.getOcId());
		data.setRenewal_card(renewalCardVO.getRenewal_card());
		data.setDescription(renewalCardVO.getDescription());
		renewalCardRepo.saveAndFlush(data);
		data.setRenewalCardId(data.getRenewalCardId());
		return renewalCardVO;
	}

	@Override
	public RenewalCardVO updateRenewalCard(RenewalCardVO renewalCard) {
		RenewalCard renewalCardId= renewalCardRepo.findById(renewalCard.getRenewalCardId()).get();
		Publisher publisher = new Publisher();
		publisher.setId(renewalCard.getPubId().getId());
		renewalCardId.setPubId(publisher);
		renewalCardId.setOcId(renewalCard.getOcId());
		renewalCardId.setRenewal_card(renewalCard.getRenewal_card());
		renewalCardId.setDescription(renewalCard.getDescription());
		renewalCardId=renewalCardRepo.saveAndFlush(renewalCardId);
		return renewalCard;
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
