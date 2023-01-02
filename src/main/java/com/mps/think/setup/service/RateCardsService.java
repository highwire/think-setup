package com.mps.think.setup.service;

import java.util.List;
import com.mps.think.setup.model.RateCards;
import com.mps.think.setup.vo.RateCardsVO;

public interface RateCardsService {
	
	public List<RateCards> findAllRateCards();

	public RateCardsVO saveRateCards(RateCardsVO rateCards);

	public RateCardsVO updateRateCards(RateCardsVO rateCards);

	public RateCards findbyrcId(Integer rcId);
	
	public RateCards deleteByrcId(Integer rcId);

}