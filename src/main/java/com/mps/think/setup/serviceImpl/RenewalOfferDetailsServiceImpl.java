package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.RenewalOfferDetails;
import com.mps.think.setup.repo.RenewalOfferDetailsRepo;
import com.mps.think.setup.service.RenewalOfferDetailsService;
import com.mps.think.setup.vo.RenewalOfferDetailsVO;
@Service
public class RenewalOfferDetailsServiceImpl implements RenewalOfferDetailsService {

	@Autowired
	RenewalOfferDetailsRepo offerDetailsRepo;
	
	@Override
	public List<RenewalOfferDetails> findAllRenewalOfferDetails() {
		return offerDetailsRepo.findAll();
	}

	@Override
	public RenewalOfferDetailsVO saveRenewalOfferDetails(RenewalOfferDetailsVO renewalOfferDetailsVO) {
		RenewalOfferDetails offerDetails=new RenewalOfferDetails();
		offerDetails.setRenewalOfferId(renewalOfferDetailsVO.getRenewalOfferId());
		offerDetails.setDescription(renewalOfferDetailsVO.getDescription());
		offerDetails.setDiscount_class_id(renewalOfferDetailsVO.getDiscount_class_id());
		offerDetails.setOrder_code_id(renewalOfferDetailsVO.getOrder_code_id());
		offerDetails.setPkg_def_id(renewalOfferDetailsVO.getPkg_def_id());
		offerDetails.setRate_class_id(renewalOfferDetailsVO.getRate_class_id());
		offerDetails.setSource_code_id(renewalOfferDetailsVO.getSource_code_id());
		offerDetails.setSubscription_def_id(renewalOfferDetailsVO.getSubscription_def_id());
		offerDetails.setTerm_id(renewalOfferDetailsVO.getTerm_id());
		offerDetailsRepo.saveAndFlush(offerDetails);
		offerDetails.setRenewalOfferDetailsId(offerDetails.getRenewalOfferDetailsId());
		return renewalOfferDetailsVO;
	}

	
	@Override
	public RenewalOfferDetailsVO updateRenewalOfferDetails(RenewalOfferDetailsVO renewalOfferDetailsVO) {

		RenewalOfferDetails details=offerDetailsRepo.findById(renewalOfferDetailsVO.getRenewalOfferDetailsId()).get();
		details.setRenewalOfferId(renewalOfferDetailsVO.getRenewalOfferId());
		details.setDescription(renewalOfferDetailsVO.getDescription());
		details.setDiscount_class_id(renewalOfferDetailsVO.getDiscount_class_id());
		details.setOrder_code_id(renewalOfferDetailsVO.getOrder_code_id());
		details.setPkg_def_id(renewalOfferDetailsVO.getPkg_def_id());
		details.setRate_class_id(renewalOfferDetailsVO.getRate_class_id());
		details.setSource_code_id(renewalOfferDetailsVO.getSource_code_id());
		details.setSubscription_def_id(renewalOfferDetailsVO.getSubscription_def_id());
		details.setTerm_id(renewalOfferDetailsVO.getTerm_id());
		details=offerDetailsRepo.saveAndFlush(details);
		return renewalOfferDetailsVO;
	}

	@Override
	public RenewalOfferDetails deleteRenewalOfferDetails(Integer renewalOfferDetailsId) {

		RenewalOfferDetails details=offerDetailsRepo.findById(renewalOfferDetailsId).get();
		offerDetailsRepo.deleteById(renewalOfferDetailsId);
		return details;
	}

	@Override
	public RenewalOfferDetails findbyRenewalOfferDetailsId(Integer renewalOfferDetailsId) {

		Optional<RenewalOfferDetails> details=offerDetailsRepo.findById(renewalOfferDetailsId);
		return details.get();
	}

}
