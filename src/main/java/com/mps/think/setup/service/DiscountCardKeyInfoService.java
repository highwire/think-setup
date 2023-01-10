package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.DiscountCardKeyInfo;
import com.mps.think.setup.vo.DiscountCardKeyInfoVO;

public interface DiscountCardKeyInfoService {

	public DiscountCardKeyInfoVO saveDiscountCard(DiscountCardKeyInfoVO discountCard);

	public DiscountCardKeyInfoVO updateDiscountCard(DiscountCardKeyInfoVO discountCard);
	
	public DiscountCardKeyInfo deleteDiscountCardById(Integer id);
	
	public List<DiscountCardKeyInfo> getAllDiscountCardKeyInfoForParent(Integer id);
	
}
