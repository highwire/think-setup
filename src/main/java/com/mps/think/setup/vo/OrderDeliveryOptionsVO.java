package com.mps.think.setup.vo;

public class OrderDeliveryOptionsVO {

	private Integer id;
	
	private String deliveryMethod;
	
	private Boolean proformaPayment;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public Boolean getProformaPayment() {
		return proformaPayment;
	}

	public void setProformaPayment(Boolean proformaPayment) {
		this.proformaPayment = proformaPayment;
	}
	
}
