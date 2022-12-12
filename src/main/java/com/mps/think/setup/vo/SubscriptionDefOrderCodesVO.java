package com.mps.think.setup.vo;

public class SubscriptionDefOrderCodesVO {

	private Integer id;
	
	private Integer publisherId;
	
	private String orderCode;
	
	private String description;
	
	private String orderCodeType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOrderCodeType() {
		return orderCodeType;
	}

	public void setOrderCodeType(String orderCodeType) {
		this.orderCodeType = orderCodeType;
	}
	
}
