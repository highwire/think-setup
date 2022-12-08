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
@Table(name = "shipping_price_list")
public class ShippingPriceList extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2284166594894095219L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "shipping_price_lst")
	private String shippingPriceList;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "shipping_method")
	private String shippingMethod;
	
	@OneToOne
	@JoinColumn(name = "publisher_id", referencedColumnName = "id")
	private Publisher publisher;
	
//	@OneToOne
//	@JoinColumn(name = "shipping_method_id", referencedColumnName = "id")
//	private ShippingMethod shippingMethodObj;
//
//	public ShippingMethod getShippingMethodObj() {
//		return shippingMethodObj;
//	}
//
//	public void setShippingMethodObj(ShippingMethod shippingMethodObj) {
//		this.shippingMethodObj = shippingMethodObj;
//	}

	public String getShippingMethod() {
		return shippingMethod;
	}

	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getShippingPriceList() {
		return shippingPriceList;
	}

	public void setShippingPriceList(String shippingPriceList) {
		this.shippingPriceList = shippingPriceList;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "ShippingPriceList [id=" + id + ", shippingPriceList=" + shippingPriceList + ", description="
				+ description + ", shippingMethod=" + shippingMethod + ", publisher=" + publisher
				+ ", shippingMethodObj=" + "]";
	}

}
