package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ren_offer_detail")
@Entity
public class RenewalOfferDetails extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "renewal_offer_details_id")
	private Integer renewalOfferDetailsId;
	
//	need to change integer to renewalOffer class name and join column with renewaloffer id
	@Column(name = "renewal_offer_id")
	private Integer renewalOfferId;
	
	@Column(name = "description")
	private String description;

//	need to change integer to discount class name and join column with discount_class_id
	@Column(name = "discount_class_id")
	private Integer discount_class_id;
	
//	need to change integer to renewalOffer class name and join column with order_code_id
	@Column(name = "order_code_id")
	private Integer order_code_id;
	
//	need to change integer to renewalOffer class name and join column with pkg_def_id
	@Column(name = "pkg_def_id")
	private Integer pkg_def_id;
	
//	need to change integer to renewalOffer class name and join column with rate_class_id
	@Column(name = "rate_class_id")
	private Integer rate_class_id;
	
//	need to change integer to renewalOffer class name and join column with source_code_id
	@Column(name = "source_code_id")
	private Integer source_code_id;
	
//	need to change integer to renewalOffer class name and join column with subscription_def_id
	@Column(name = "subscription_def_id")
	private Integer subscription_def_id;
	
//	need to change integer to renewalOffer class name and join column with term_id
	@Column(name = "term_id")
	private Integer term_id;

	public Integer getRenewalOfferDetailsId() {
		return renewalOfferDetailsId;
	}

	public void setRenewalOfferDetailsId(Integer renewalOfferDetailsId) {
		this.renewalOfferDetailsId = renewalOfferDetailsId;
	}

	public Integer getRenewalOfferId() {
		return renewalOfferId;
	}

	public void setRenewalOfferId(Integer renewalOfferId) {
		this.renewalOfferId = renewalOfferId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDiscount_class_id() {
		return discount_class_id;
	}

	public void setDiscount_class_id(Integer discount_class_id) {
		this.discount_class_id = discount_class_id;
	}

	public Integer getOrder_code_id() {
		return order_code_id;
	}

	public void setOrder_code_id(Integer order_code_id) {
		this.order_code_id = order_code_id;
	}

	public Integer getPkg_def_id() {
		return pkg_def_id;
	}

	public void setPkg_def_id(Integer pkg_def_id) {
		this.pkg_def_id = pkg_def_id;
	}

	public Integer getRate_class_id() {
		return rate_class_id;
	}

	public void setRate_class_id(Integer rate_class_id) {
		this.rate_class_id = rate_class_id;
	}

	public Integer getSource_code_id() {
		return source_code_id;
	}

	public void setSource_code_id(Integer source_code_id) {
		this.source_code_id = source_code_id;
	}

	public Integer getSubscription_def_id() {
		return subscription_def_id;
	}

	public void setSubscription_def_id(Integer subscription_def_id) {
		this.subscription_def_id = subscription_def_id;
	}

	public Integer getTerm_id() {
		return term_id;
	}

	public void setTerm_id(Integer term_id) {
		this.term_id = term_id;
	}

	@Override
	public String toString() {
		return "RenewalOfferDetails [renewalOfferDetailsId=" + renewalOfferDetailsId + ", renewalOfferId="
				+ renewalOfferId + ", description=" + description + ", discount_class_id=" + discount_class_id
				+ ", order_code_id=" + order_code_id + ", pkg_def_id=" + pkg_def_id + ", rate_class_id=" + rate_class_id
				+ ", source_code_id=" + source_code_id + ", subscription_def_id=" + subscription_def_id + ", term_id="
				+ term_id + "]";
	}
}
