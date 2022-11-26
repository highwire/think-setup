package com.mps.think.setup.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "order_item_details")
public class OrderItemDetails extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -825080156498928924L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "effective_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date effectiveDate;
	
	@Column(name = "item_url")
	private String itemUrl;
	
	@Column(name = "item_image")
	private String itemImage;

	@Column(name = "grace_quantity")
	private String graceQuantity;
	
	@Column(name = "price")
	private String price;
	
	@Column(name = "shipping_weight")
	private String shippingWeight;
	
	@Column(name = "commodity_code")
	private String commodityCode;
	
	@Column(name = "media")
	private String media;
	
	@Column(name = "edition")
	private String edition;
	
	@Column(name = "category")
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
	
}
