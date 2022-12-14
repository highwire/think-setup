package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "subscription_category")

public class SubscriptionCategories extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subscription_category_id")
	private Integer SubscriptionCategoriesId;
	
	 @OneToOne
	 @JoinColumn(name = "pub_id", referencedColumnName = "id")
	 private Publisher pubId;

	@Column(name = "subscription_category")
	private String SubscriptionCategory;

	@Column(name = "description")
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
		return "SubscriptionCategories [SubscriptionCategoriesId=" + SubscriptionCategoriesId + ", pubId=" + pubId
				+ ", SubscriptionCategory=" + SubscriptionCategory + ", Description=" + Description + "]";
	}

	
}
