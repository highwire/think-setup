package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

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
		List<CreditStatus> list =creditStatusRepo.findAll();
		if(list.isEmpty()) {
			throw new NotFoundException("No Credit Name Present, please add Credit Name!.");
		}
		return list;
	}

	@Override
	public CreditStatusVO savecreditStatus(CreditStatusVO creditStatus) {
		CreditStatus data1=creditStatusRepo.findBycreditName(creditStatus.getCreditName());
		if(data1 !=null) {
			throw new DataIntegrityViolationException(
					"Credit name : "+creditStatus.getCreditName()+" already exist!");
//			throw new DataIntegrityViolationException("Credit name : "+creditStatus.getCreditName()+" already exist!");
		}
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
		Optional<CreditStatus> cs =creditStatusRepo.findById(creditId);
		if(!cs.isPresent()) {
			throw new NoSuchElementException("Credit Id : "+creditId+" does not exist!");
		}
		return cs.get();
	}

}
