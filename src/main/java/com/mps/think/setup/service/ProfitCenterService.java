package com.mps.think.setup.service;

import java.util.List;


import com.mps.think.setup.model.ProfitCenter;
import com.mps.think.setup.vo.ProfitCenterVO;

public interface ProfitCenterService {

	public List<ProfitCenter> findAllcreditStatus();

	public ProfitCenterVO savecreditStatus(ProfitCenterVO profitCenter);

	public ProfitCenterVO updatecreditStatus(ProfitCenterVO profitCenter);

	public ProfitCenter findbycreditId(Integer creditId);
	
	public ProfitCenter deleteByproftIdId(Integer proftId);

}
