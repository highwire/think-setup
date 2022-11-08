package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mps.think.setup.model.CreditStatus;
import com.mps.think.setup.repo.CreditStatusRepo;
import com.mps.think.setup.service.CreditStatusService;
import com.mps.think.setup.vo.CreditStatusVO;

public class CreditStatusServiceImpl implements CreditStatusService {

	@Autowired
	CreditStatusRepo creditStatusRepo;
	@Override
	public List<CreditStatus> findAllcreditStatus() {
		return creditStatusRepo.findAll();
	}

	@Override
	public CreditStatusVO savecreditStatus(CreditStatusVO creditStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CreditStatusVO updatecreditStatus(CreditStatusVO creditStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findbycreditId(Integer creditId) {
		// TODO Auto-generated method stub
		return null;
	}

}
