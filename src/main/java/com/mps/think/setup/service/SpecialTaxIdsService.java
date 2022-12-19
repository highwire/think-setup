package com.mps.think.setup.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mps.think.setup.model.SpecialTaxIds;
import com.mps.think.setup.vo.SpecialTaxIdsVO;

@Service
public interface SpecialTaxIdsService {
	
	public List<SpecialTaxIds> findAllSpecialTaxIds();

	public SpecialTaxIdsVO saveSpecialTaxIds(SpecialTaxIdsVO specialTaxIds);

	public SpecialTaxIdsVO updateSpecialTaxIds(SpecialTaxIdsVO specialTaxIds);

	public SpecialTaxIds findbySpecialTaxIdsId(Integer SpecialTaxIdsId);
	
	public SpecialTaxIds deleteBySpecialTaxIdsId(Integer id);


}
