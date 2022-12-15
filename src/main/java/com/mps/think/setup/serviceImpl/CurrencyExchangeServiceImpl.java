package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.CurrencyExchange;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.repo.CurrencyExchangeRepo;
import com.mps.think.setup.service.CurrencyExchangeService;
import com.mps.think.setup.vo.CurrencyExchangeVO;

@Service
public class CurrencyExchangeServiceImpl implements CurrencyExchangeService {

	@Autowired
	CurrencyExchangeRepo currencyExchangeRepo;

	@Override
	public List<CurrencyExchange> findAllCurrencyExchange() {
		return currencyExchangeRepo.findAll();
	}

	@Override
	public CurrencyExchangeVO saveCurrencyExchange(CurrencyExchangeVO currrncyExc) {
		CurrencyExchange currencyExchange= new CurrencyExchange();
		currencyExchange.setCurrency_Date(currrncyExc.getCurrency_Date());
		currencyExchange.setCurrencyCode(currrncyExc.getCurrencyCode());
		currencyExchange.setDescription(currrncyExc.getDescription());
		currencyExchange.setSymbol(currrncyExc.getSymbol());
		Publisher publisher = new Publisher();
		publisher.setId(currrncyExc.getPubId().getId());
		currencyExchange.setPubId(publisher);
		currencyExchange = currencyExchangeRepo.save(currencyExchange);
		currrncyExc.setExchangeRate(currencyExchange.getCurrencyExchangeId());
		return currrncyExc;
	}

	@Override
	public CurrencyExchangeVO updateCurrencyExchange(CurrencyExchangeVO currrncyExc) {
		CurrencyExchange currencyExchange= new CurrencyExchange();
		currencyExchange.setCurrencyExchangeId(currrncyExc.getCurrencyExchangeId());
		currencyExchange.setCurrency_Date(currrncyExc.getCurrency_Date());
		currencyExchange.setCurrencyCode(currrncyExc.getCurrencyCode());
		currencyExchange.setDescription(currrncyExc.getDescription());
		currencyExchange.setSymbol(currrncyExc.getSymbol());
		Publisher publisher = new Publisher();
		publisher.setId(currrncyExc.getPubId().getId());
		currencyExchange.setPubId(publisher);
		currencyExchange = currencyExchangeRepo.save(currencyExchange);
		return currrncyExc;
	}

	@Override
	public CurrencyExchange findbyId(Integer currrncyExcId) {
		return currencyExchangeRepo.findById(currrncyExcId).get();
	}

}
