package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.CreditStatus;
import com.mps.think.setup.vo.CreditStatusVO;

public interface CreditStatusService {

	public List<CreditStatus> findAllcreditStatus();

	public CreditStatusVO savecreditStatus(CreditStatusVO creditStatus);

	public CreditStatusVO updatecreditStatus(CreditStatusVO creditStatus);

	public CreditStatus findbycreditId(Integer creditId);

}
