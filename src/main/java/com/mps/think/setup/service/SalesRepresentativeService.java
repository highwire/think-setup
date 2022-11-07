package com.mps.think.setup.service;

import java.util.List;
import java.util.Optional;

import com.mps.think.setup.vo.SalesRepresentativeVO;

public interface SalesRepresentativeService {

	public List<SalesRepresentativeVO> findAllSalesRepresentative();

	public SalesRepresentativeVO saveContactDetails(SalesRepresentativeVO contact);

	public Optional<SalesRepresentativeVO> findbyContactId(Integer contactId);

	boolean findByEmail(String email);

	SalesRepresentativeVO findbytId(Integer contactId);

}
