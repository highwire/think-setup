package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.CreditStatus;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.repo.CreditStatusRepo;
import com.mps.think.setup.service.CreditStatusService;
import com.mps.think.setup.vo.CreditStatusVO;
@Service
public class CreditStatusServiceImpl implements CreditStatusService {

	@Autowired
	CreditStatusRepo creditStatusRepo;
	@Override
	public List<CreditStatus> findAllcreditStatus() {
		return creditStatusRepo.findAll();
	}

	@Override
	public CreditStatusVO savecreditStatus(CreditStatusVO creditStatus) {
		CreditStatus data = new CreditStatus();
		data.setCreditName(creditStatus.getCreditName());
		data.setDescription(creditStatus.getDescription());
		data.setBadcredit(creditStatus.getBadcredit());
		Publisher publisher=new Publisher();
		publisher.setId(creditStatus.getPubId().getId());
		data.setPubId(publisher);
		creditStatusRepo.saveAndFlush(data);
		creditStatus.setCreditId(data.getCreditId());
		return creditStatus;
	}

	@Override
	public CreditStatusVO updatecreditStatus(CreditStatusVO creditStatus) {
		CreditStatus data = new CreditStatus();
		data.setCreditName(creditStatus.getCreditName());
		data.setDescription(creditStatus.getDescription());
		data.setBadcredit(creditStatus.getBadcredit());
		data.setCreditId(creditStatus.getCreditId());
		Publisher publisher=new Publisher();
		publisher.setId(creditStatus.getPubId().getId());
		data.setPubId(publisher);
		creditStatusRepo.saveAndFlush(data);
		return creditStatus;
	}

	@Override
	public CreditStatus findbycreditId(Integer creditId) {
		
	}

}
