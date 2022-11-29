package com.mps.think.setup.vo;

import javax.persistence.Column;

public class SubscriptionCategoriesVO {
	private Integer SubscriptionCategoriesId;
	private String SubscriptionCategory;
	private String Description;
	public Integer getSubscriptionCategoriesId() {
		return SubscriptionCategoriesId;
	}
	public void setSubscriptionCategoriesId(Integer subscriptionCategoriesId) {
		SubscriptionCategoriesId = subscriptionCategoriesId;
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
		return "SubscriptionCategoriesVO [SubscriptionCategoriesId=" + SubscriptionCategoriesId
				+ ", SubscriptionCategory=" + SubscriptionCategory + ", Description=" + Description + "]";
	}

	
}
