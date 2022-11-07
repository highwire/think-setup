package com.mps.think.setup.vo;

import java.math.BigInteger;

import com.mps.think.setup.vo.EnumModelVO.Currency;
import com.mps.think.setup.vo.EnumModelVO.DateFormat;
import com.mps.think.setup.vo.EnumModelVO.TimeZone;

public class PublisherVO {

	private Integer id;
	private String name;

	private String status;

	private String abbreviation;
	private String website;
	private String address1;

	private String address2;
	private Integer zipCode;

	private String city;

	private String state;

	private String country;

	private String isdCode;

	private BigInteger primaryPhone;

	private String email;

	private String logoUrl;

	private TimeZone timeZone;

	private Currency currency;
	private DateFormat dateformat;

	private BigInteger secondaryPhone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
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

	public String getIsdCode() {
		return isdCode;
	}

	public void setIsdCode(String isdCode) {
		this.isdCode = isdCode;
	}

	public BigInteger getPrimaryPhone() {
		return primaryPhone;
	}

	public void setPrimaryPhone(BigInteger primaryPhone) {
		this.primaryPhone = primaryPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public TimeZone getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public DateFormat getDateformat() {
		return dateformat;
	}

	public void setDateformat(DateFormat dateformat) {
		this.dateformat = dateformat;
	}


	public BigInteger getSecondaryPhone() {
		return secondaryPhone;
	}

	public void setSecondaryPhone(BigInteger secondaryPhone) {
		this.secondaryPhone = secondaryPhone;
	}

	@Override
	public String toString() {
		return "Publisher [id=" + id + ", name=" + name + ", status=" + status + ", abbreviation=" + abbreviation
				+ ", website=" + website + ", address1=" + address1 + ", address2=" + address2 + ", zipCode=" + zipCode
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", isdCode=" + isdCode
				+ ", primaryPhone=" + primaryPhone + ", email=" + email + ", logoUrl=" + logoUrl + ", timeZone="
				+ timeZone + ", currency=" + currency + ", dateformat=" + dateformat + ", secondaryPhone="
				+ secondaryPhone + "]";
	}

}