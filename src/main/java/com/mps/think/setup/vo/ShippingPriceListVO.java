package com.mps.think.setup.vo;

import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.model.ShippingMethod;

public class ShippingPriceListVO {

	private Integer id;
	
	private String shippingPriceList;
	
	private String description;
	
	private String shippingMethod;
	
	private Publisher publisher;
	
//	private ShippingMethod shippingMethodObj;
	
	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

//	public ShippingMethod getShippingMethodObj() {
//		return shippingMethodObj;
//	}
//
//	public void setShippingMethodObj(ShippingMethod shippingMethodObj) {
//		this.shippingMethodObj = shippingMethodObj;
//	}


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

	public String getShippingMethod() {
		return shippingMethod;
	}

	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

	@Override
	public String toString() {
		return "ShippingPriceListVO [id=" + id + ", shippingPriceList=" + shippingPriceList + ", description="
				+ description + ", shippingMethod=" + shippingMethod + ", publisher=" + publisher
				+ ", shippingMethodObj=" + "]";
	}
	
}
