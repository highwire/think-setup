package com.mps.think.setup.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mps.think.setup.model.TaxRateCategory;
import com.mps.think.setup.model.TaxType;
import com.mps.think.setup.vo.TaxRateCategoryVO;

@Service
public interface TaxRateCategoryService {
	public List<TaxRateCategory> findAllTaxRateCategory();

	public TaxRateCategoryVO saveTaxRateCategory(TaxRateCategoryVO taxRateCategory);

	public TaxRateCategoryVO updateTaxRateCategory(TaxRateCategoryVO taxRateCategory);

	public TaxRateCategory findbyTaxRateCategoryId(Integer taxRateCategoryId);
	
	public TaxRateCategory deleteByTaxRateCategoryId(Integer id);

}
