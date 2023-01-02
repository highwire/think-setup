package com.mps.think.setup.vo;

import java.util.Date;

import com.mps.think.setup.model.DiscountCardKeyInfo;


public class EffectiveDatesForDiscountVO {

	private Integer id;

	private Date effectiveDate;

	private String region;

	private Integer fromQuantity;

	private Integer toQuantity;

	private Integer fromAmount;

	private Integer toAmount;

	private String currency;

	private Integer discountPercent;

	private String unitType;
	
	private DiscountCardKeyInfo discountCardId;

//	private Integer discountCardId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getFromQuantity() {
		return fromQuantity;
	}

	public void setFromQuantity(Integer fromQuantity) {
		this.fromQuantity = fromQuantity;
	}

	public Integer getToQuantity() {
		return toQuantity;
	}

	public void setToQuantity(Integer toQuantity) {
		this.toQuantity = toQuantity;
	}

	public Integer getFromAmount() {
		return fromAmount;
	}

	public void setFromAmount(Integer fromAmount) {
		this.fromAmount = fromAmount;
	}

	public Integer getToAmount() {
		return toAmount;
	}

	public void setToAmount(Integer toAmount) {
		this.toAmount = toAmount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(Integer discountPercent) {
		this.discountPercent = discountPercent;
	}

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public DiscountCardKeyInfo getDiscountCardId() {
		return discountCardId;
	}

	public void setDiscountCardId(DiscountCardKeyInfo discountCardId) {
		this.discountCardId = discountCardId;
	}
	

	
	
}
