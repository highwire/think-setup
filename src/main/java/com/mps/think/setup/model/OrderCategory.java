package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "order_categories")
@Entity
public class OrderCategory extends BaseEntity {

	/**
	 * 
	 */
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ordercategoryId")
	private Integer orderCategoryId;
	
	@OneToOne
	@JoinColumn(name = "pub_id", referencedColumnName = "id")
	private Publisher pubId;
	
	@Column(name = "order_category")
	private String orderCategory;
	
	@Column(name = "order_description")
	private String orderDescription;

	public Integer getOrderCategoryId() {
		return orderCategoryId;
	}

	public void setOrderCategoryId(Integer orderCategoryId) {
		this.orderCategoryId = orderCategoryId;
	}

	public Publisher getPubId() {
		return pubId;
	}

	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}

	public String getOrderCategory() {
		return orderCategory;
	}

	public void setOrderCategory(String orderCategory) {
		this.orderCategory = orderCategory;
	}

	public String getOrderDescription() {
		return orderDescription;
	}

	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}

	@Override
	public String toString() {
		return "OrderCategory [orderCategoryId=" + orderCategoryId + ", pubId=" + pubId + ", orderCategory="
				+ orderCategory + ", orderDescription=" + orderDescription + "]";
	}

//changed table colnum name	
	
	

}
