package com.mps.think.setup.vo;

import java.util.Date;

public class OrderItemDetailsVO {

	private Integer id;
	
	private Integer publisherId;
	
	private Date effectiveDate;
	
	private String itemUrl;
	
	private String itemImage;

	private String graceQuantity;
	
	private String price;
	
	private String shippingWeight;
	
	private String commodityCode;
	
	private String media;
	
	private String edition;
	
	private String category;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getItemUrl() {
		return itemUrl;
	}

	public void setItemUrl(String itemUrl) {
		this.itemUrl = itemUrl;
	}

	public String getItemImage() {
		return itemImage;
	}

	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}

	public String getGraceQuantity() {
		return graceQuantity;
	}

	public void setGraceQuantity(String graceQuantity) {
		this.graceQuantity = graceQuantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getShippingWeight() {
		return shippingWeight;
	}

	public void setShippingWeight(String shippingWeight) {
		this.shippingWeight = shippingWeight;
	}

	public String getCommodityCode() {
		return commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
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

	public Integer getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}
	
}
