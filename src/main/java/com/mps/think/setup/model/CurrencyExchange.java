package com.mps.think.setup.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name = "currency_exchange")
@Entity
public class CurrencyExchange extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "curr_id")
	private Integer currencyExchangeId;

	@OneToOne
	@JoinColumn(name = "pub_id", referencedColumnName = "id")
	private Publisher pubId;

	@Column(name = "currency_code")
	private String CurrencyCode;

	@Column(name = "symbol")
	private String Symbol;

	@Column(name = "Description")
	private Integer Description;
	
	@Column(name = "exchange_rate")
	private Integer exchangeRate;
	
	@Column(name = "currency_Date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date currency_Date;

	public Integer getCurrencyExchangeId() {
		return currencyExchangeId;
	}

	public void setCurrencyExchangeId(Integer currencyExchangeId) {
		this.currencyExchangeId = currencyExchangeId;
	}

	public Publisher getPubId() {
		return pubId;
	}

	public void setPubId(Publisher pubId) {
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
		return "CurrencyExchange [currencyExchangeId=" + currencyExchangeId + ", pubId=" + pubId + ", CurrencyCode="
				+ CurrencyCode + ", Symbol=" + Symbol + ", Description=" + Description + ", exchangeRate="
				+ exchangeRate + ", currency_Date=" + currency_Date + "]";
	}

}