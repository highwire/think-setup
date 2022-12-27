package com.mps.think.setup.vo;

import java.util.Date;

import com.mps.think.setup.model.CustomerDetails;
import com.mps.think.setup.vo.EnumModelVO.AddressCategory;
import com.mps.think.setup.vo.EnumModelVO.AddressType;
import com.mps.think.setup.vo.EnumModelVO.Frequency;

public class AddressesVO {
	
	private Integer addressId;
	private CustomerDetails cusId;
	private String addressName;
	private AddressType addressType;
	private AddressCategory addressCategory;
	private Boolean status;
	private Boolean primaryAddress;
	private String name;
	private String addressLine1;
	private String addressLine2;
	private Integer zipCode;
	private String city;
	private String state;
	private String country;
	private String countryCode;
	private String phone;
	private Date validFrom;
	private Date validTo;
	private Frequency frequency;
	private Date selectionFrom;
	private Date selectionTo;
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public CustomerDetails getCusId() {
		return cusId;
	}
	public void setCusId(CustomerDetails cusId) {
		this.cusId = cusId;
	}

	public String getAddressName() {
		return addressName;
	}
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	public AddressType getAddressType() {
		return addressType;
	}
	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}
	public AddressCategory getAddressCategory() {
		return addressCategory;
	}
	public void setAddressCategory(AddressCategory addressCategory) {
		this.addressCategory = addressCategory;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getPrimaryAddress() {
		return primaryAddress;
	}
	public void setPrimaryAddress(Boolean primaryAddress) {
		this.primaryAddress = primaryAddress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public Integer getZipCode() {
		return zipCode;
	}
	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}
	public Date getValidTo() {
		return validTo;
	}
	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}
	public Frequency getFrequency() {
		return frequency;
	}
	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}
	public Date getSelectionFrom() {
		return selectionFrom;
	}
	public void setSelectionFrom(Date selectionFrom) {
		this.selectionFrom = selectionFrom;
	}
	public Date getSelectionTo() {
		return selectionTo;
	}
	public void setSelectionTo(Date selectionTo) {
		this.selectionTo = selectionTo;
	}
	
	@Override
	public String toString() {
		return "AddressesVO [addressId=" + addressId + ", cusId=" + cusId + ", addressName=" + addressName
				+ ", addressType=" + addressType + ", addressCategory=" + addressCategory + ", status=" + status
				+ ", primaryAddress=" + primaryAddress + ", name=" + name + ", addressLine1=" + addressLine1
				+ ", addressLine2=" + addressLine2 + ", zipCode=" + zipCode + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", countryCode=" + countryCode + ", phone=" + phone + ", validFrom="
				+ validFrom + ", validTo=" + validTo + ", frequency=" + frequency + ", selectionFrom=" + selectionFrom
				+ ", selectionTo=" + selectionTo + "]";
	}
	
	

}
