package com.mps.think.setup.vo;

import com.mps.think.setup.model.Publisher;

public class SubscriptionCategoriesVO {
	private Integer SubscriptionCategoriesId;
	private Publisher pubId;
	private String SubscriptionCategory;
	private String Description;
	public Integer getSubscriptionCategoriesId() {
		return SubscriptionCategoriesId;
	}
	public void setSubscriptionCategoriesId(Integer subscriptionCategoriesId) {
		SubscriptionCategoriesId = subscriptionCategoriesId;
	}
	public Publisher getPubId() {
		return pubId;
	}
	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}
	public String getSubscriptionCategory() {
		return SubscriptionCategory;
	}
	public void setSubscriptionCategory(String subscriptionCategory) {
		SubscriptionCategory = subscriptionCategory;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@Override
	public String toString() {
		return "SubscriptionCategoriesVO [SubscriptionCategoriesId=" + SubscriptionCategoriesId + ", pubId=" + pubId
				+ ", SubscriptionCategory=" + SubscriptionCategory + ", Description=" + Description + "]";
	}
	
}
