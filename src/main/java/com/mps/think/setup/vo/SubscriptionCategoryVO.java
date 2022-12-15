package com.mps.think.setup.vo;

import com.mps.think.setup.model.Publisher;

public class SubscriptionCategoryVO {
	
	private Integer id;
	private Publisher pubId;
	private String subscriptionCategory;
	private String description;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Publisher getPubId() {
		return pubId;
	}
	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}
	public String getSubscriptionCategory() {
		return subscriptionCategory;
	}
	public void setSubscriptionCategory(String subscriptionCategory) {
		this.subscriptionCategory = subscriptionCategory;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "SubscriptionCategoryVO [id=" + id + ", pubId=" + pubId + ", subscriptionCategory="
				+ subscriptionCategory + ", description=" + description + "]";
	}
	

}
