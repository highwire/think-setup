package com.mps.think.setup.vo;

import java.util.Date;



import com.mps.think.setup.model.RateCards;
import com.mps.think.setup.vo.EnumModelVO.Currency;

public class RateCardsRenewalsVO {
	
    private Integer id;
	private RateCards renewalId;
	private Date effectiveDate;
	private Float defaultPricePerItem;
	private Float defaultPricePerDay;
	private Date renewalExpiryDate;
	private String effectiveDateDescription;
	private Float totalPrice;
	private Float basicPrice;
	private Currency currency;
	private String itemsType;
	private Float items;
	private Float unitPrice;
	private Float specialPrice;
	private Float quantityDiscount;
	private Integer fromQuantity;
	private Integer toQuantity;
	private String validForRegions;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public RateCards getRenewalId() {
		return renewalId;
	}
	public void setRenewalId(RateCards renewalId) {
		this.renewalId = renewalId;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public Float getDefaultPricePerItem() {
		return defaultPricePerItem;
	}
	public void setDefaultPricePerItem(Float defaultPricePerItem) {
		this.defaultPricePerItem = defaultPricePerItem;
	}
	public Float getDefaultPricePerDay() {
		return defaultPricePerDay;
	}
	public void setDefaultPricePerDay(Float defaultPricePerDay) {
		this.defaultPricePerDay = defaultPricePerDay;
	}
	public Date getRenewalExpiryDate() {
		return renewalExpiryDate;
	}
	public void setRenewalExpiryDate(Date renewalExpiryDate) {
		this.renewalExpiryDate = renewalExpiryDate;
	}
	public String getEffectiveDateDescription() {
		return effectiveDateDescription;
	}
	public void setEffectiveDateDescription(String effectiveDateDescription) {
		this.effectiveDateDescription = effectiveDateDescription;
	}
	public Float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Float getBasicPrice() {
		return basicPrice;
	}
	public void setBasicPrice(Float basicPrice) {
		this.basicPrice = basicPrice;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public String getItemsType() {
		return itemsType;
	}
	public void setItemsType(String itemsType) {
		this.itemsType = itemsType;
	}
	public Float getItems() {
		return items;
	}
	public void setItems(Float items) {
		this.items = items;
	}
	public Float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Float getSpecialPrice() {
		return specialPrice;
	}
	public void setSpecialPrice(Float specialPrice) {
		this.specialPrice = specialPrice;
	}
	public Float getQuantityDiscount() {
		return quantityDiscount;
	}
	public void setQuantityDiscount(Float quantityDiscount) {
		this.quantityDiscount = quantityDiscount;
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
	public String getValidForRegions() {
		return validForRegions;
	}
	public void setValidForRegions(String validForRegions) {
		this.validForRegions = validForRegions;
	}
	@Override
	public String toString() {
		return "RateCardsRenewalsVO [id=" + id + ", renewalId=" + renewalId + ", effectiveDate=" + effectiveDate
				+ ", defaultPricePerItem=" + defaultPricePerItem + ", defaultPricePerDay=" + defaultPricePerDay
				+ ", renewalExpiryDate=" + renewalExpiryDate + ", effectiveDateDescription=" + effectiveDateDescription
				+ ", totalPrice=" + totalPrice + ", basicPrice=" + basicPrice + ", currency=" + currency
				+ ", itemsType=" + itemsType + ", items=" + items + ", unitPrice=" + unitPrice + ", specialPrice="
				+ specialPrice + ", quantityDiscount=" + quantityDiscount + ", fromQuantity=" + fromQuantity
				+ ", toQuantity=" + toQuantity + ", validForRegions=" + validForRegions + "]";
	}
	
	
	

}
