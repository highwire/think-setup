package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.EffectiveDatesForDiscount;
import com.mps.think.setup.vo.EffectiveDatesForDiscountVO;

public interface EffectiveDatesForDiscountService {

	public EffectiveDatesForDiscountVO saveEffectiveDateForDiscount(EffectiveDatesForDiscountVO effectiveDateForDiscount);
	
	public EffectiveDatesForDiscountVO updateEffectiveDatesForDiscount(EffectiveDatesForDiscountVO effectiveDateForDiscount);
	
	public EffectiveDatesForDiscount deleteEffectiveDatesForDiscountById(Integer id);
	
	public List<EffectiveDatesForDiscount> getEffectiveDatesForDiscountCard(Integer discountCardInfoId);
	
}
