package com.mps.think.setup.vo;


public class RenewalOfferDetailsVO {
	
	private Integer renewalOfferDetailsId;

//	need to change integer to renewalOffer class name 
	private Integer renewalOfferId;

	private String description;

//	need to change integer to discount class name 
	private Integer discount_class_id;

//	need to change integer to renewalOffer class name 
	private Integer order_code_id;

//	need to change integer to renewalOffer class name 
	private Integer pkg_def_id;

//	need to change integer to renewalOffer class name 
	private Integer rate_class_id;

//	need to change integer to renewalOffer class name 
	private Integer source_code_id;

//	need to change integer to renewalOffer class name 
	private Integer subscription_def_id;

//	need to change integer to renewalOffer class name 
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
		return "RenewalOfferDetailsVO [renewalOfferDetailsId=" + renewalOfferDetailsId + ", renewalOfferId="
				+ renewalOfferId + ", description=" + description + ", discount_class_id=" + discount_class_id
				+ ", order_code_id=" + order_code_id + ", pkg_def_id=" + pkg_def_id + ", rate_class_id=" + rate_class_id
				+ ", source_code_id=" + source_code_id + ", subscription_def_id=" + subscription_def_id + ", term_id="
				+ term_id + "]";
	}
	
}
