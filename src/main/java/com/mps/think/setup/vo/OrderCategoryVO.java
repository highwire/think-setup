package com.mps.think.setup.vo;

public class OrderCategoryVO {
	
	private Integer orderCategoryId;
	private PublisherVO pubId;
	private String orderDescription;
	private String orderCategory;
	public Integer getOrderCategoryId() {
		return orderCategoryId;
	}
	public void setOrderCategoryId(Integer orderCategoryId) {
		this.orderCategoryId = orderCategoryId;
	}
	public PublisherVO getPubId() {
		return pubId;
	}
	public void setPubId(PublisherVO pubId) {
		this.pubId = pubId;
	}
	public String getOrderDescription() {
		return orderDescription;
	}
	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}
	public String getOrderCategory() {
		return orderCategory;
	}
	public void setOrderCategory(String orderCategory) {
		this.orderCategory = orderCategory;
	}
	@Override
	public String toString() {
		return "OrderCategoryVO [orderCategoryId=" + orderCategoryId + ", pubId=" + pubId + ", orderDescription="
				+ orderDescription + ", orderCategory=" + orderCategory + "]";
	}
}
