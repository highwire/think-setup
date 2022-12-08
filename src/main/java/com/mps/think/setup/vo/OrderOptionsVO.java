package com.mps.think.setup.vo;

import javax.persistence.Column;

public class OrderOptionsVO {
	
	private Integer id;
	
	private Integer publisherId;
	
	private String subscriptionCalculation;
	
	private String revenueRealisedBy;
	
	private String taxonomy;
	
	private String renewalCard;
	
	private Boolean controlled;
	
	private Boolean segmentedOrder;
	
	private String media;
	
	private String edition;
	
	private String category;
	
	private String rotation;

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

	public Integer getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRotation() {
		return rotation;
	}

	public void setRotation(String rotation) {
		this.rotation = rotation;
	}

}
