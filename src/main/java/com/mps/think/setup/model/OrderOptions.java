package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_options")
public class OrderOptions extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8228804696918920708L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "subscription_calculation")
	private String subscriptionCalculation;
	
	@Column(name = "revenue_realised_by")
	private String revenueRealisedBy;
	
	@Column(name = "taxonomy")
	private String taxonomy;
	
	@Column(name = "renewal_card")
	private String renewalCard;
	
	@Column(name = "controlled")
	private Boolean controlled;
	
	@Column(name = "segmented_order")
	private Boolean segmentedOrder;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSubscriptionCalculation() {
		return subscriptionCalculation;
	}

	public void setSubscriptionCalculation(String subscriptionCalculation) {
		this.subscriptionCalculation = subscriptionCalculation;
	}

	public String getRevenueRealisedBy() {
		return revenueRealisedBy;
	}

	public void setRevenueRealisedBy(String revenueRealisedBy) {
		this.revenueRealisedBy = revenueRealisedBy;
	}

	public String getTaxonomy() {
		return taxonomy;
	}

	public void setTaxonomy(String taxonomy) {
		this.taxonomy = taxonomy;
	}

	public String getRenewalCard() {
		return renewalCard;
	}

	public void setRenewalCard(String renewalCard) {
		this.renewalCard = renewalCard;
	}

	public Boolean getControlled() {
		return controlled;
	}

	public void setControlled(Boolean controlled) {
		this.controlled = controlled;
	}

	public Boolean getSegmentedOrder() {
		return segmentedOrder;
	}

	public void setSegmentedOrder(Boolean segmentedOrder) {
		this.segmentedOrder = segmentedOrder;
	}

}
