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
	
	@Column(name = "publisher_id")
	private Integer publisherId;
	
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
	
	@Column(name = "grace_quantity")
	private String graceQuanitity;
	
	@Column(name = "trial_type")
	private String trialType;
	
	@Column(name = "media")
	private String media;
	
	@Column(name = "edition")
	private String edition;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "rotation")
	private String rotation;
	
	@Column(name = "number_of_issues")
	private String numOfIssues;
	
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

	public String getGraceQuanitity() {
		return graceQuanitity;
	}

	public void setGraceQuanitity(String graceQuanitity) {
		this.graceQuanitity = graceQuanitity;
	}

	public String getTrialType() {
		return trialType;
	}

	public void setTrialType(String trialType) {
		this.trialType = trialType;
	}

	public String getNumOfIssues() {
		return numOfIssues;
	}

	public void setNumOfIssues(String numOfIssues) {
		this.numOfIssues = numOfIssues;
	}

}
