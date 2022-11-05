package com.mps.think.setup.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mps.think.setup.vo.EnumModel.Currency;
import com.mps.think.setup.vo.EnumModel.DateFormat;
import com.mps.think.setup.vo.EnumModel.TimeZone;

@Entity
@Table(name = "publisher_details")
public class Publisher extends BaseEntity {

	private static final long serialVersionUID = -7608605119832745196L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "status")
	private String status;

//	@OneToMany
//	private List<SalesRepresentative> publisherContact;

//  ======= profile =================
	@Column(name = "abbreviation")
	private String abbreviation;

	@Column(name = "website")
	private String website;

	@Column(name = "address1")
	private String address1;

	@Column(name = "address2")
	private String address2;

	@Column(name = "zip_code")
	private Integer zipCode;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "country")
	private String country;

	@Column(name = "isd_Code")
	private String isdCode;

	@Column(name = "primary_Phone")
	private BigInteger primaryPhone;

	@Column(name = "email")
	private String email;

	@Column(name = "Logo_Url")
	private String logoUrl;

	@Enumerated(EnumType.STRING)
	@Column(name = "timeZone")
	private TimeZone timeZone;

	@Enumerated(EnumType.STRING)
	@Column(name = "currency")
	private Currency currency;

	@Enumerated(EnumType.STRING)
	@Column(name = "date_format")
	private DateFormat dateformat;

	@Column(name = "secondary_Phone")
	private BigInteger secondary_Phone;

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

	public BigInteger getSecondary_Phone() {
		return secondary_Phone;
	}

	public void setSecondary_Phone(BigInteger secondary_Phone) {
		this.secondary_Phone = secondary_Phone;
	}

	@Override
	public String toString() {
		return "Publisher [id=" + id + ", name=" + name + ", status=" + status + ", abbreviation=" + abbreviation
				+ ", website=" + website + ", address1=" + address1 + ", address2=" + address2 + ", zipCode=" + zipCode
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", isdCode=" + isdCode
				+ ", primaryPhone=" + primaryPhone + ", email=" + email + ", logoUrl=" + logoUrl + ", timeZone="
				+ timeZone + ", currency=" + currency + ", dateformat=" + dateformat + ", secondary_Phone="
				+ secondary_Phone + "]";
	}



}