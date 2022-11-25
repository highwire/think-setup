package com.mps.think.setup.vo;

public class OrderCategoryVo {
private Integer id;
	
	private String orderCategory;
	
	private String orderDescription;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		return "OrderCategoryVo [id=" + id + ", orderCategory=" + orderCategory + ", orderDescription="
				+ orderDescription + "]";
	}

	



}
