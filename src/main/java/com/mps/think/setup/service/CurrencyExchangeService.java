package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.CurrencyExchange;
import com.mps.think.setup.vo.CurrencyExchangeVO;

public interface CurrencyExchangeService {

	public List<CurrencyExchange> findAllCurrencyExchange();

	public CurrencyExchangeVO saveCurrencyExchange(CurrencyExchangeVO currrncyExc);

	public CurrencyExchangeVO updateCurrencyExchange(CurrencyExchangeVO currrncyExc);

	public CurrencyExchange findbyId(Integer currrncyExcId);

}
