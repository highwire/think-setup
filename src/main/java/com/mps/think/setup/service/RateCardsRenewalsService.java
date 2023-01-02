package com.mps.think.setup.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.mps.think.setup.model.RateCardsRenewals;

import com.mps.think.setup.vo.RateCardsRenewalsVO;

@Service
public interface RateCardsRenewalsService {
	
	public List<RateCardsRenewals> getAllRateCardsRenewals();

	public RateCardsRenewalsVO saveRateCardsRenewals(RateCardsRenewalsVO rateCardsRenewals);

	public RateCardsRenewalsVO updateRateCardsRenewals(RateCardsRenewalsVO rateCardsRenewals);

	public RateCardsRenewals findbyRateCardsRenewalsId(Integer id);
	
	public RateCardsRenewals deleteByRateCardsRenewalsId(Integer id);
	
	public List<RateCardsRenewals> getAllRateCardsRenewalsByRcId(Integer renewalId);

}
