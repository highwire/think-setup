package com.mps.think.setup.vo;

public class OrderAddressMappingVO {
	
	private Integer id;
	
	private Integer addressId;
	
	private Boolean shippingAddress;
	
	private Boolean billingAddress;
	
	private Boolean alternateAddress;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public Boolean getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Boolean shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Boolean getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Boolean billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Boolean getAlternateAddress() {
		return alternateAddress;
	}

	public void setAlternateAddress(Boolean alternateAddress) {
		this.alternateAddress = alternateAddress;
	}

}
