package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.TaxRateCategory;
import com.mps.think.setup.model.TaxType;
import com.mps.think.setup.repo.TaxRateCategoryRepo;
import com.mps.think.setup.service.TaxRateCategoryService;
import com.mps.think.setup.vo.TaxRateCategoryVO;
@Service
public class TaxRateCategoryServiceImpl implements TaxRateCategoryService{
	
	@Autowired
	TaxRateCategoryRepo taxRateCategoryRepo;

	@Override
	public List<TaxRateCategory> findAllTaxRateCategory() {
		// TODO Auto-generated method stub
		return taxRateCategoryRepo.findAll();
	}

	@Override
	public TaxRateCategoryVO saveTaxRateCategory(TaxRateCategoryVO taxRateCategory) {
		TaxRateCategory trc=new TaxRateCategory();
		trc.setId(taxRateCategory.getId());
		trc.setTaxRateCategory(taxRateCategory.getTaxRateCategory());
		trc.setDescription(taxRateCategory.getDescription());
		taxRateCategoryRepo.saveAndFlush(trc);
		return taxRateCategory;
	}

	@Override
	public TaxRateCategoryVO updateTaxRateCategory(TaxRateCategoryVO taxRateCategory) {
		for (TaxRateCategory curr : taxRateCategoryRepo.findAll()) {
			if (curr.getId().equals(taxRateCategory.getId())) {
				curr.setTaxRateCategory(taxRateCategory.getTaxRateCategory());
				curr.setDescription(taxRateCategory.getDescription());
				taxRateCategoryRepo.saveAndFlush(curr);
				return taxRateCategory;
			}
			}
		return null;
	}

	@Override
	public TaxRateCategory findbyTaxRateCategoryId(Integer taxRateCategoryId) {
		for (TaxRateCategory curr : taxRateCategoryRepo.findAll()) {
			if (curr.getId().equals(taxRateCategoryId)) {
				return curr;
			}
		}
		return null;
	}

	@Override
	public TaxRateCategory deleteByTaxRateCategoryId(Integer id) {
		TaxRateCategory delete = findbyTaxRateCategoryId(id);
		taxRateCategoryRepo.delete(delete);
		return delete;
	}

}
