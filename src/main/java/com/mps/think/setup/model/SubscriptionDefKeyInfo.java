package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mps.think.setup.vo.EnumModelVO.SubDefStatus;

@Entity
@Table(name = "subscription_def_key_information")
public class SubscriptionDefKeyInfo extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 905010494963750034L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "publisher_id")
	private Integer publisherId;
	
	@Column(name = "subscription_def_code")
	private String subscriptionDefCode;

	@Column(name = "description")
	private String description;
	
	@Column(name = "order_code")
	private String orderCode;
	
	@Column(name = "term")
	private String term;
	
	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private SubDefStatus status;
	
	@Column(name = "subscription_def_id")
	private String subscriptionDefId;
	
	@Column(name = "rate_class")
	private String rateClass;
	
	@Column(name = "renewal_cards")
	private String renewalCard;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}

	public String getSubscriptionDefCode() {
		return subscriptionDefCode;
	}

	public void setSubscriptionDefCode(String subscriptionDefCode) {
		this.subscriptionDefCode = subscriptionDefCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public SubDefStatus getStatus() {
		return status;
	}

	public void setStatus(SubDefStatus status) {
		this.status = status;
	}

	public String getSubscriptionDefId() {
		return subscriptionDefId;
	}

	public void setSubscriptionDefId(String subscriptionDefId) {
		this.subscriptionDefId = subscriptionDefId;
	}

	public String getRateClass() {
		return rateClass;
	}

	public void setRateClass(String rateClass) {
		this.rateClass = rateClass;
	}

	public String getRenewalCard() {
		return renewalCard;
	}

	public void setRenewalCard(String renewalCard) {
		this.renewalCard = renewalCard;
	}
	
}
