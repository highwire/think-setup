package com.mps.think.setup.vo;


import com.mps.think.setup.model.Addresses;

public class OrderAddressMappingVO {
	
	private Integer id;
	
	private Addresses address;
	
	private Boolean shippingAddress;
	
	private Boolean billingAddress;
	
	private Boolean alternateAddress;
	
	private Boolean renewalAddress;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Addresses getAddress() {
		return address;
	}

	public void setAddress(Addresses address) {
		this.address = address;
	}

	public Boolean getRenewalAddress() {
		return renewalAddress;
	}

	public void setRenewalAddress(Boolean renewalAddress) {
		this.renewalAddress = renewalAddress;
	}

}
