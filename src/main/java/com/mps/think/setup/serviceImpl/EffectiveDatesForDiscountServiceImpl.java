package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.think.setup.model.EffectiveDatesForDiscount;
import com.mps.think.setup.repo.EffectiveDatesForDiscountRepo;
import com.mps.think.setup.service.EffectiveDatesForDiscountService;
import com.mps.think.setup.vo.EffectiveDatesForDiscountVO;

@Service
public class EffectiveDatesForDiscountServiceImpl implements EffectiveDatesForDiscountService {

	@Autowired
	private EffectiveDatesForDiscountRepo effectiveDatesForDiscountRepo;
	
	@Override
	public EffectiveDatesForDiscountVO saveEffectiveDateForDiscount(EffectiveDatesForDiscountVO effectiveDateForDiscount) {
		ObjectMapper mapper = new ObjectMapper();
		effectiveDatesForDiscountRepo.saveAndFlush(mapper.convertValue(effectiveDateForDiscount, EffectiveDatesForDiscount.class));
		return effectiveDateForDiscount;
	}

	@Override
	public EffectiveDatesForDiscountVO updateEffectiveDatesForDiscount(EffectiveDatesForDiscountVO effectiveDateForDiscount) {
		ObjectMapper mapper = new ObjectMapper();
		effectiveDatesForDiscountRepo.saveAndFlush(mapper.convertValue(effectiveDateForDiscount, EffectiveDatesForDiscount.class));
		return effectiveDateForDiscount;
	}

	@Override
	public EffectiveDatesForDiscount deleteEffectiveDatesForDiscountById(Integer id) {
		Optional<EffectiveDatesForDiscount> effectiveDate = effectiveDatesForDiscountRepo.findById(id);
		if(effectiveDate.isPresent()) {
			effectiveDatesForDiscountRepo.delete(effectiveDate.get());
			return effectiveDate.get();
		}
		return null;
	}

	@Override
	public List<EffectiveDatesForDiscount> getEffectiveDatesForDiscountCard(Integer discountCardInfoId) {
		return effectiveDatesForDiscountRepo.findByDiscountCardId(discountCardInfoId, Sort.by(Sort.Direction.ASC, "effectiveDate"));
	}

}
