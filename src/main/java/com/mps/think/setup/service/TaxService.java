package com.mps.think.setup.service;

import java.util.List;


import com.mps.think.setup.model.TaxType;
import com.mps.think.setup.vo.TaxTypeVO;

public interface TaxService {

	public List<TaxType> findAllTaxType();

	public TaxTypeVO saveTaxType(TaxTypeVO taxType);

	public TaxTypeVO updateTaxType(TaxTypeVO taxType);

	public TaxType findbyTaxType(Integer taxId);
	
	public TaxType deleteByTaxTypeId(Integer taxId);

}
