package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.think.setup.model.DiscountCardKeyInfo;
import com.mps.think.setup.model.EffectiveDatesForDiscount;
import com.mps.think.setup.repo.DiscountCardKeyInfoRepo;
import com.mps.think.setup.repo.EffectiveDatesForDiscountRepo;
import com.mps.think.setup.service.DiscountCardKeyInfoService;
import com.mps.think.setup.service.EffectiveDatesForDiscountService;
import com.mps.think.setup.vo.DiscountCardKeyInfoVO;

@Service
public class DiscountCardKeyInfoServiceImpl implements DiscountCardKeyInfoService {

	@Autowired
	private DiscountCardKeyInfoRepo discountCardKeyInfoRepo;
	
	@Autowired
	private EffectiveDatesForDiscountService effectiveDateService;
	
	@Override
	public DiscountCardKeyInfoVO saveDiscountCard(DiscountCardKeyInfoVO discountCard) {
		ObjectMapper mapper = new ObjectMapper();
		discountCardKeyInfoRepo.saveAndFlush(mapper.convertValue(discountCard, DiscountCardKeyInfo.class));
		return discountCard;
	}

	@Override
	public DiscountCardKeyInfoVO updateDiscountCard(DiscountCardKeyInfoVO discountCard) {
		ObjectMapper mapper = new ObjectMapper();
		discountCardKeyInfoRepo.saveAndFlush(mapper.convertValue(discountCard, DiscountCardKeyInfo.class));
		return discountCard;
	}

	@Override
	public DiscountCardKeyInfo deleteDiscountCardById(Integer discountCardId) {
		Optional<DiscountCardKeyInfo> discountCard = discountCardKeyInfoRepo.findById(discountCardId);
		if (discountCard.isPresent()) {
			effectiveDateService.deleteEffectiveDatesForDiscountCard(discountCardId);
			discountCardKeyInfoRepo.delete(discountCard.get());
			return discountCard.get();
		}
		return null;
	}

	@Override
	public List<DiscountCardKeyInfo> getAllDiscountCardKeyInfoForParent(Integer id) {
		return discountCardKeyInfoRepo.findByParentId(id);
	}

}
