package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Table(name = "rate_Cards")
@Entity
public class RateCards extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rcId")
	private Integer rcId;
	
	@ManyToOne
	@JoinColumn(name = "parent_id", referencedColumnName = "parent_id")
	private ParentClass parentId;
	
	@Column(name = "rateClassEffectiveSequence")
	private Integer rateClassEffectiveSequence;
	
	@Column(name = "rateClassId")
	private Integer rateClassId;
	
	@Column(name = "rateCard")
	private String rateCard;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "orderClasses")
	private String orderClasses;
	
	@Column(name = "useForPackage")
	private Boolean useForPackage;

	public Integer getRcId() {
		return rcId;
	}

	public void setRcId(Integer rcId) {
		this.rcId = rcId;
	}

	public ParentClass getParentId() {
		return parentId;
	}

	public void setParentId(ParentClass parentId) {
		this.parentId = parentId;
	}

	public Integer getRateClassEffectiveSequence() {
		return rateClassEffectiveSequence;
	}

	public void setRateClassEffectiveSequence(Integer rateClassEffectiveSequence) {
		this.rateClassEffectiveSequence = rateClassEffectiveSequence;
	}

	public Integer getRateClassId() {
		return rateClassId;
	}

	public void setRateClassId(Integer rateClassId) {
		this.rateClassId = rateClassId;
	}

	public String getRateCard() {
		return rateCard;
	}

	public void setRateCard(String rateCard) {
		this.rateCard = rateCard;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOrderClasses() {
		return orderClasses;
	}

	public void setOrderClasses(String orderClasses) {
		this.orderClasses = orderClasses;
	}

	public Boolean getUseForPackage() {
		return useForPackage;
	}

	public void setUseForPackage(Boolean useForPackage) {
		this.useForPackage = useForPackage;
	}

	@Override
	public String toString() {
		return "RateCards [rcId=" + rcId + ", parentId=" + parentId + ", rateClassEffectiveSequence="
				+ rateClassEffectiveSequence + ", rateClassId=" + rateClassId + ", rateCard=" + rateCard
				+ ", description=" + description + ", orderClasses=" + orderClasses + ", useForPackage=" + useForPackage
				+ "]";
	}

	
	
}
