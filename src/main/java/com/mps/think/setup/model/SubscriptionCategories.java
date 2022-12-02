package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Subscription_Category")
@Entity
public class SubscriptionCategories extends BaseEntity {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Subscription_Category_id")
	private Integer SubscriptionCategoriesId;

	@Column(name = "Subscription_Category")
	private String SubscriptionCategory;

	@Column(name = "Description")
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
		return "SubscriptionCategories [SubscriptionCategoriesId=" + SubscriptionCategoriesId
				+ ", SubscriptionCategory=" + SubscriptionCategory + ", Description=" + Description + "]";
	}

	
}
