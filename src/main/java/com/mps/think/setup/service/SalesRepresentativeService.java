package com.mps.think.setup.service;

import java.util.List;
import java.util.Optional;

import com.mps.think.setup.model.SalesRepresentative;
import com.mps.think.setup.vo.SalesRepresentativeVO;

public interface SalesRepresentativeService {

	public List<SalesRepresentative> findAllSalesRepresentative();

	public SalesRepresentativeVO saveSalesRepresentative(SalesRepresentativeVO salesRepresentativeVO);

	public Optional<SalesRepresentativeVO> findbyContactId(Integer contactId);

	boolean findByEmail(String email);

	SalesRepresentativeVO findbytId(Integer contactId);

}
