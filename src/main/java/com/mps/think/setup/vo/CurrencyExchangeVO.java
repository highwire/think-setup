package com.mps.think.setup.vo;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class CurrencyExchangeVO {

	private Integer currencyExchangeId;

	private PublisherVO pubId;

	private String CurrencyCode;

	private String Symbol;

	private Integer Description;

	private Integer exchangeRate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date currency_Date;

	public Integer getCurrencyExchangeId() {
		return currencyExchangeId;
	}

	public void setCurrencyExchangeId(Integer currencyExchangeId) {
		this.currencyExchangeId = currencyExchangeId;
	}

	public PublisherVO getPubId() {
		return pubId;
	}

	public void setPubId(PublisherVO pubId) {
		this.pubId = pubId;
	}

	public String getCurrencyCode() {
		return CurrencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		CurrencyCode = currencyCode;
	}

	public String getSymbol() {
		return Symbol;
	}

	public void setSymbol(String symbol) {
		Symbol = symbol;
	}

	public Integer getDescription() {
		return Description;
	}

	public void setDescription(Integer description) {
		Description = description;
	}

	public Integer getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(Integer exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public Date getCurrency_Date() {
		return currency_Date;
	}

	public void setCurrency_Date(Date currency_Date) {
		this.currency_Date = currency_Date;
	}

	@Override
	public String toString() {
		return "CurrencyExchangeVO [currencyExchangeId=" + currencyExchangeId + ", pubId=" + pubId + ", CurrencyCode="
				+ CurrencyCode + ", Symbol=" + Symbol + ", Description=" + Description + ", exchangeRate="
				+ exchangeRate + ", currency_Date=" + currency_Date + "]";
	}

}