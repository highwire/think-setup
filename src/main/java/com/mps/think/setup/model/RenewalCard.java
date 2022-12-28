package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Table(name = "renewal_card")
@Entity
public class RenewalCard extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "renewal_card_id")
	private Integer renewalCardId;
	
	@Column(name = "description")
	private String description;
	
	@Column(name="renewal_card")
	private String renewal_card;
	
	@Column(name = "effortFrom")
	private String effortFrom;
	
	@Column(name = "effortTo")
	private String effortTo;
	
	@Column(name = "offers_description")
	private String offersdescription;

//	need to change integer to discount class name and join column with discount_class_id
	@Column(name = "discount_class_id")
	private Integer discountClassId;
	
//	need to change integer to renewalOffer class name and join column with order_code_id
	@Column(name = "order_code_id")
	private Integer orderCodeId;
	
//	need to change integer to renewalOffer class name and join column with pkg_def_id
	@Column(name = "pkg_def_id")
	private Integer pkgDefId;
	
//	need to change integer to renewalOffer class name and join column with rate_class_id
	@Column(name = "rate_class_id")
	private Integer rateClassId;
	
//	need to change integer to renewalOffer class name and join column with source_code_id
	@Column(name = "source_code_id")
	private Integer sourceCodeId;
	
//	need to change integer to renewalOffer class name and join column with subscription_def_id
	@Column(name = "subscription_def_id")
	private Integer subscriptionDefId;
	
//	need to change integer to parent class name and join column with parent class id
	@Column(name="parent_id")
	private Integer parentId;
	
	@Column(name="child_id")
	private Integer childId;
	
	@Column(name="sub_child_id")
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

	public String getRenewal_card() {
		return renewal_card;
	}

	public void setRenewal_card(String renewal_card) {
		this.renewal_card = renewal_card;
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

	public String getOffersdescription() {
		return offersdescription;
	}

	public void setOffersdescription(String offersdescription) {
		this.offersdescription = offersdescription;
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
		return "RenewalCard [renewalCardId=" + renewalCardId + ", description=" + description + ", renewal_card="
				+ renewal_card + ", effortFrom=" + effortFrom + ", effortTo=" + effortTo + ", offersdescription="
				+ offersdescription + ", discountClassId=" + discountClassId + ", orderCodeId=" + orderCodeId
				+ ", pkgDefId=" + pkgDefId + ", rateClassId=" + rateClassId + ", sourceCodeId=" + sourceCodeId
				+ ", subscriptionDefId=" + subscriptionDefId + ", parentId=" + parentId + ", childId=" + childId
				+ ", subChildId=" + subChildId + "]";
	}

}
