package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.SalesRepresentative;
import com.mps.think.setup.vo.SalesRepresentativeVO;

public interface SalesRepresentativeService {

	public List<SalesRepresentative> findAllSalesRepresentative();

	public SalesRepresentativeVO saveSalesRepresentative(SalesRepresentativeVO salesRepresentativeVO);

	public SalesRepresentative findbySalesRepresentativeId(Integer contactId);

	SalesRepresentative findbytId(Integer contactId);

}
