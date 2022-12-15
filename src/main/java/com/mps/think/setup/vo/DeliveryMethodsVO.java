package com.mps.think.setup.vo;

import com.mps.think.setup.model.Publisher;

public class DeliveryMethodsVO {

	private Integer deliveryMethodsId;
	
	private Boolean defaultDelivery;
	
	private String deliveryMethod;
	
	private Boolean active;
	
	private String description;
	
	private String regionList;
	
	private String amount;

	private String transportMode;
	
	private Publisher publisher;
	
	public Integer getDeliveryMethodsId() {
		return deliveryMethodsId;
	}

	public void setDeliveryMethodsId(Integer deliveryMethodsId) {
		this.deliveryMethodsId = deliveryMethodsId;
	}

	public Boolean getDefaultDelivery() {
		return defaultDelivery;
	}

	public void setDefaultDelivery(Boolean defaultDelivery) {
		this.defaultDelivery = defaultDelivery;
	}

	public String getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRegionList() {
		return regionList;
	}

	public void setRegionList(String regionList) {
		this.regionList = regionList;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTransportMode() {
		return transportMode;
	}

	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

}
