package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.RenewalCard;
import com.mps.think.setup.vo.RenewalCardVO;

public interface RenewalCardService {
	public List<RenewalCard> findAllRenewalCard();

	public RenewalCardVO saveRenewalCard(RenewalCardVO renewalCardVO);

	public RenewalCardVO updateRenewalCard(RenewalCardVO renewalCardVO);
	
	public RenewalCard deleteRenewalCard(Integer renewalCardId);

	public RenewalCard findbyRenewalCardId(Integer renewalCardId);
}
