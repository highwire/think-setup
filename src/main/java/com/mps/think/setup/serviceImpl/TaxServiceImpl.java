package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.model.TaxType;
import com.mps.think.setup.repo.TaxTypeRepo;
import com.mps.think.setup.service.TaxService;
import com.mps.think.setup.vo.TaxTypeVO;

@Service
public class TaxServiceImpl implements TaxService {
	@Autowired
	TaxTypeRepo taxTypeRepo;

	@Override
	public List<TaxType> findAllTaxType() {
		return taxTypeRepo.findAll();
	}

	@Override
	public TaxTypeVO saveTaxType(TaxTypeVO taxTypeVO) {
		TaxType taxType = new TaxType();
		taxType.setDescription(taxTypeVO.getDescription());
		taxType.setTaxType(taxTypeVO.getTaxType());
		Publisher publisher = new Publisher();
		publisher.setId(taxTypeVO.getPubId().getId());
		taxType.setPubId(publisher);
		taxType = taxTypeRepo.save(taxType);
		taxTypeVO.setTaxId(taxType.getTaxId());
		return taxTypeVO;
	}

	@Override
	public TaxTypeVO updateTaxType(TaxTypeVO taxTypeVO) {
		TaxType taxType = new TaxType();
		taxType.setTaxId(taxTypeVO.getTaxId());
		taxType.setDescription(taxTypeVO.getDescription());
		taxType.setTaxType(taxTypeVO.getTaxType());
		Publisher publisher = new Publisher();
		publisher.setId(taxTypeVO.getPubId().getId());
		taxType.setPubId(publisher);
		taxType = taxTypeRepo.save(taxType);
		return taxTypeVO;
	}

	@Override
	public TaxType findbyTaxType(Integer taxId) {
		return taxTypeRepo.findById(taxId).get();
	}

	@Override
	public TaxType deleteByTaxTypeId(Integer taxId) {
		TaxType delete = taxTypeRepo.findByTaxId(taxId);
		taxTypeRepo.delete(delete);
		return delete;
	}

}
