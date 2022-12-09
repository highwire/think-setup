package com.mps.think.setup.service;

import java.util.List;
import java.util.Optional;

import com.mps.think.setup.model.RenewalOfferDetails;
import com.mps.think.setup.vo.RenewalOfferDetailsVO;

public interface RenewalOfferDetailsService {
	
	public List<RenewalOfferDetails> findAllRenewalOfferDetails();

	public RenewalOfferDetailsVO saveRenewalOfferDetails(RenewalOfferDetailsVO renewalOfferDetailsVO);

	public RenewalOfferDetailsVO updateRenewalOfferDetails(RenewalOfferDetailsVO renewalOfferDetailsVO);
	
	public RenewalOfferDetails deleteRenewalOfferDetails(Integer renewalOfferDetailsId);

	public RenewalOfferDetails findbyRenewalOfferDetailsId(Integer renewalOfferDetailsId);

}
