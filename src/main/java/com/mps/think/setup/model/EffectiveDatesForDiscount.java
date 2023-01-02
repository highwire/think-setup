package com.mps.think.setup.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "effective_dates_for_discount")
public class EffectiveDatesForDiscount extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5448773115662157293L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "effective_date")
	private Date effectiveDate;
	
	@Column(name = "region")
	private String region;
	
	@Column(name = "from_quantity")
	private Integer fromQuantity;
	
	@Column(name = "to_quantity")
	private Integer toQuantity;
	
	@Column(name = "from_amount")
	private Integer fromAmount;
	
	@Column(name = "to_amount")
	private Integer toAmount;
	
	@Column(name = "currency")
	private String currency;
	
	@Column(name = "discount_percent")
	private Integer discountPercent;
	
	@Column(name = "unit_type")
	private String unitType;
	
	@ManyToOne
	@JoinColumn(name = "discount_card_id", referencedColumnName = "id")
	private DiscountCardKeyInfo discountCardId;
	
//	@Column(name = "discount_card_id")
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
