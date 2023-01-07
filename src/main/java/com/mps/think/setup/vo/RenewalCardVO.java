package com.mps.think.setup.vo;


public class RenewalCardVO {
	private Integer renewalCardId;
	private String description;
	private String renewalCard;
	private String effortFrom;
	private String effortTo;
	private String offersDescription;
	private Integer discountClassId;
	private Integer orderCodeId;
	private Integer pkgDefId;
	private Integer rateClassId;
	private Integer sourceCodeId;
	private Integer subscriptionDefId;
	private Integer parentId;
	private Integer childId;
	private Integer subChildId;
	public Integer getRenewalCardId() {
		return renewalCardId;
	}
	public void setRenewalCardId(Integer renewalCardId) {
		this.renewalCardId = renewalCardId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRenewalCard() {
		return renewalCard;
	}
	public void setRenewalCard(String renewalCard) {
		this.renewalCard = renewalCard;
	}
	public String getEffortFrom() {
		return effortFrom;
	}
	public void setEffortFrom(String effortFrom) {
		this.effortFrom = effortFrom;
	}
	public String getEffortTo() {
		return effortTo;
	}
	public void setEffortTo(String effortTo) {
		this.effortTo = effortTo;
	}
	public String getOffersDescription() {
		return offersDescription;
	}
	public void setOffersDescription(String offersDescription) {
		this.offersDescription = offersDescription;
	}
	public Integer getDiscountClassId() {
		return discountClassId;
	}
	public void setDiscountClassId(Integer discountClassId) {
		this.discountClassId = discountClassId;
	}
	public Integer getOrderCodeId() {
		return orderCodeId;
	}
	public void setOrderCodeId(Integer orderCodeId) {
		this.orderCodeId = orderCodeId;
	}
	public Integer getPkgDefId() {
		return pkgDefId;
	}
	public void setPkgDefId(Integer pkgDefId) {
		this.pkgDefId = pkgDefId;
	}
	public Integer getRateClassId() {
		return rateClassId;
	}
	public void setRateClassId(Integer rateClassId) {
		this.rateClassId = rateClassId;
	}
	public Integer getSourceCodeId() {
		return sourceCodeId;
	}
	public void setSourceCodeId(Integer sourceCodeId) {
		this.sourceCodeId = sourceCodeId;
	}
	public Integer getSubscriptionDefId() {
		return subscriptionDefId;
	}
	public void setSubscriptionDefId(Integer subscriptionDefId) {
		this.subscriptionDefId = subscriptionDefId;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Integer getChildId() {
		return childId;
	}
	public void setChildId(Integer childId) {
		this.childId = childId;
	}
	public Integer getSubChildId() {
		return subChildId;
	}
	public void setSubChildId(Integer subChildId) {
		this.subChildId = subChildId;
	}
	@Override
	public String toString() {
		return "RenewalCardVO [renewalCardId=" + renewalCardId + ", description=" + description + ", renewalCard="
				+ renewalCard + ", effortFrom=" + effortFrom + ", effortTo=" + effortTo + ", offersDescription="
				+ offersDescription + ", discountClassId=" + discountClassId + ", orderCodeId=" + orderCodeId
				+ ", pkgDefId=" + pkgDefId + ", rateClassId=" + rateClassId + ", sourceCodeId=" + sourceCodeId
				+ ", subscriptionDefId=" + subscriptionDefId + ", parentId=" + parentId + ", childId=" + childId
				+ ", subChildId=" + subChildId + "]";
	}
	
	
}
