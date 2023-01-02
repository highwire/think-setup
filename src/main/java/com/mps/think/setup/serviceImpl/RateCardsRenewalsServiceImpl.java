package com.mps.think.setup.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.RateCards;
import com.mps.think.setup.model.RateCardsRenewals;
import com.mps.think.setup.repo.RateCardsRenewalsRepo;
import com.mps.think.setup.service.RateCardsRenewalsService;
import com.mps.think.setup.vo.RateCardsRenewalsVO;

@Service
public class RateCardsRenewalsServiceImpl implements RateCardsRenewalsService{
	
	@Autowired
	private RateCardsRenewalsRepo rateCardsRenewalsRepo;

	@Override
	public List<RateCardsRenewals> getAllRateCardsRenewals() {
		return rateCardsRenewalsRepo.findAll();
	}

	@Override
	public RateCardsRenewalsVO saveRateCardsRenewals(RateCardsRenewalsVO rateCardsRenewals) {
		RateCardsRenewals data = new RateCardsRenewals();
		data.setEffectiveDate(rateCardsRenewals.getEffectiveDate());
		data.setDefaultPricePerDay(rateCardsRenewals.getDefaultPricePerDay());
		data.setDefaultPricePerItem(rateCardsRenewals.getDefaultPricePerItem());
		data.setRenewalExpiryDate(rateCardsRenewals.getRenewalExpiryDate());
		data.setEffectiveDateDescription(rateCardsRenewals.getEffectiveDateDescription());
		data.setTotalPrice(rateCardsRenewals.getTotalPrice());
		data.setBasicPrice(rateCardsRenewals.getBasicPrice());
		data.setCurrency(rateCardsRenewals.getCurrency());
		data.setItemsType(rateCardsRenewals.getItemsType());
		data.setItems(rateCardsRenewals.getItems());
		data.setUnitPrice(rateCardsRenewals.getBasicPrice()/rateCardsRenewals.getItems());
		data.setSpecialPrice(rateCardsRenewals.getSpecialPrice());
		data.setQuantityDiscount(rateCardsRenewals.getQuantityDiscount());
		data.setToQuantity(rateCardsRenewals.getToQuantity());
		data.setFromQuantity(rateCardsRenewals.getFromQuantity());
		data.setValidForRegions(rateCardsRenewals.getValidForRegions());
//		rateCardsRenewals.setRenewalId(data.getRenewalId());
		rateCardsRenewals.setId(data.getId());
		RateCards rateCards = new RateCards();
		rateCards.setRcId(rateCardsRenewals.getRenewalId().getRcId());
		data.setRenewalId(rateCards);
		rateCardsRenewalsRepo.saveAndFlush(data);
		return rateCardsRenewals;
	}

	@Override
	public RateCardsRenewalsVO updateRateCardsRenewals(RateCardsRenewalsVO rateCardsRenewals) {
		RateCardsRenewals data = findbyRateCardsRenewalsId( rateCardsRenewals.getId());
		data.setEffectiveDate(rateCardsRenewals.getEffectiveDate());
		data.setDefaultPricePerDay(rateCardsRenewals.getDefaultPricePerDay());
		data.setDefaultPricePerItem(rateCardsRenewals.getDefaultPricePerItem());
		data.setRenewalExpiryDate(rateCardsRenewals.getRenewalExpiryDate());
		data.setEffectiveDateDescription(rateCardsRenewals.getEffectiveDateDescription());
		data.setTotalPrice(rateCardsRenewals.getTotalPrice());
		data.setBasicPrice(rateCardsRenewals.getBasicPrice());
		data.setCurrency(rateCardsRenewals.getCurrency());
		data.setItemsType(rateCardsRenewals.getItemsType());
		data.setItems(rateCardsRenewals.getItems());
		data.setUnitPrice(rateCardsRenewals.getBasicPrice()/rateCardsRenewals.getItems());
		data.setSpecialPrice(rateCardsRenewals.getSpecialPrice());
		data.setQuantityDiscount(rateCardsRenewals.getQuantityDiscount());
		data.setToQuantity(rateCardsRenewals.getToQuantity());
		data.setFromQuantity(rateCardsRenewals.getFromQuantity());
		data.setValidForRegions(rateCardsRenewals.getValidForRegions());
		rateCardsRenewals.setRenewalId(data.getRenewalId());
		RateCards rateCards = new RateCards();
		rateCards.setRcId(rateCardsRenewals.getRenewalId().getRcId());
		data.setRenewalId(rateCards);
		rateCardsRenewalsRepo.saveAndFlush(data);
		return rateCardsRenewals;
	}

	@Override
	public RateCardsRenewals findbyRateCardsRenewalsId(Integer id) {
		 Optional<RateCardsRenewals> cr = rateCardsRenewalsRepo.findById(id);
			return cr.get();
	}

	@Override
	public RateCardsRenewals deleteByRateCardsRenewalsId(Integer id) {
		RateCardsRenewals delete = findbyRateCardsRenewalsId(id);
		rateCardsRenewalsRepo.delete(delete);
		return delete;
	}

	@Override
	public List<RateCardsRenewals> getAllRateCardsRenewalsByRcId(Integer renewalId) {
		List<RateCardsRenewals> output = new ArrayList<>();
		for (RateCardsRenewals rateCardsRenewals : rateCardsRenewalsRepo.findAll()) {
			if (rateCardsRenewals.getRenewalId().getRcId().equals(renewalId)) {
				output.add(rateCardsRenewals);
			}
		}
		return output;
	}

}
