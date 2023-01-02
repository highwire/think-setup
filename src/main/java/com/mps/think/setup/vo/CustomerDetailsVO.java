package com.mps.think.setup.vo;


import java.util.List;

import com.mps.think.setup.model.CustomerAddresses;
import com.mps.think.setup.vo.EnumModelVO.ChargeTaxOn;
import com.mps.think.setup.vo.EnumModelVO.ConfigurationOptionsforOrders;
import com.mps.think.setup.vo.EnumModelVO.CustomerCategory;
import com.mps.think.setup.vo.EnumModelVO.PaymentOptions;

public class CustomerDetailsVO {
	
	private Integer customerId;
	private CustomerCategory customerCategory;
	private String salutation;
	private String fname;
	private String lname;
	private String initialName;
	private String suffix;
	private String company;
	private String department;
	private String email;
	private String countryCode;
	private String primaryPhone;
	private String mobileNumber;
	private String taxId;
	private Boolean taxExempt;
	private String secondaryEmail;
	private String secondaryPhone;
	private String listRental;
	private String salesRepresentative;
	private String creditStatus;
	private String fax;
	private Integer institutionalId;
	private Integer parentInstitutionalId;
	private ChargeTaxOn chargeTaxOn;
	private PaymentOptions paymentOptions;
	private ConfigurationOptionsforOrders configurationOptionsforOrders;
	private String newOrderCommission;
	private String renewalCommission;
	private String paymentThreshold;
	private List<CustomerAddresses> customerAddresses;
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public CustomerCategory getCustomerCategory() {
		return customerCategory;
	}
	public void setCustomerCategory(CustomerCategory customerCategory) {
		this.customerCategory = customerCategory;
	}
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getInitialName() {
		return initialName;
	}
	public void setInitialName(String initialName) {
		this.initialName = initialName;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getPrimaryPhone() {
		return primaryPhone;
	}
	public void setPrimaryPhone(String primaryPhone) {
		this.primaryPhone = primaryPhone;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getTaxId() {
		return taxId;
	}
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
	public Boolean getTaxExempt() {
		return taxExempt;
	}
	public void setTaxExempt(Boolean taxExempt) {
		this.taxExempt = taxExempt;
	}
	public String getSecondaryEmail() {
		return secondaryEmail;
	}
	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}
	public String getSecondaryPhone() {
		return secondaryPhone;
	}
	public void setSecondaryPhone(String secondaryPhone) {
		this.secondaryPhone = secondaryPhone;
	}
	public String getListRental() {
		return listRental;
	}
	public void setListRental(String listRental) {
		this.listRental = listRental;
	}
	public String getSalesRepresentative() {
		return salesRepresentative;
	}
	public void setSalesRepresentative(String salesRepresentative) {
		this.salesRepresentative = salesRepresentative;
	}
	public String getCreditStatus() {
		return creditStatus;
	}
	public void setCreditStatus(String creditStatus) {
		this.creditStatus = creditStatus;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public Integer getInstitutionalId() {
		return institutionalId;
	}
	public void setInstitutionalId(Integer institutionalId) {
		this.institutionalId = institutionalId;
	}
	public Integer getParentInstitutionalId() {
		return parentInstitutionalId;
	}
	public void setParentInstitutionalId(Integer parentInstitutionalId) {
		this.parentInstitutionalId = parentInstitutionalId;
	}
	public ChargeTaxOn getChargeTaxOn() {
		return chargeTaxOn;
	}
	public void setChargeTaxOn(ChargeTaxOn chargeTaxOn) {
		this.chargeTaxOn = chargeTaxOn;
	}
	public PaymentOptions getPaymentOptions() {
		return paymentOptions;
	}
	public void setPaymentOptions(PaymentOptions paymentOptions) {
		this.paymentOptions = paymentOptions;
	}
	public ConfigurationOptionsforOrders getConfigurationOptionsforOrders() {
		return configurationOptionsforOrders;
	}
	public void setConfigurationOptionsforOrders(ConfigurationOptionsforOrders configurationOptionsforOrders) {
		this.configurationOptionsforOrders = configurationOptionsforOrders;
	}
	public String getNewOrderCommission() {
		return newOrderCommission;
	}
	public void setNewOrderCommission(String newOrderCommission) {
		this.newOrderCommission = newOrderCommission;
	}
	public String getRenewalCommission() {
		return renewalCommission;
	}
	public void setRenewalCommission(String renewalCommission) {
		this.renewalCommission = renewalCommission;
	}
	public String getPaymentThreshold() {
		return paymentThreshold;
	}
	public void setPaymentThreshold(String paymentThreshold) {
		this.paymentThreshold = paymentThreshold;
	}
	public List<CustomerAddresses> getCustomerAddresses() {
		return customerAddresses;
	}
	public void setCustomerAddresses(List<CustomerAddresses> customerAddresses) {
		this.customerAddresses = customerAddresses;
	}
	@Override
	public String toString() {
		return "CustomerDetailsVO [customerId=" + customerId + ", customerCategory=" + customerCategory
				+ ", salutation=" + salutation + ", fname=" + fname + ", lname=" + lname + ", initialName="
				+ initialName + ", suffix=" + suffix + ", company=" + company + ", department=" + department
				+ ", email=" + email + ", countryCode=" + countryCode + ", primaryPhone=" + primaryPhone
				+ ", mobileNumber=" + mobileNumber + ", taxId=" + taxId + ", taxExempt=" + taxExempt
				+ ", secondaryEmail=" + secondaryEmail + ", secondaryPhone=" + secondaryPhone + ", listRental="
				+ listRental + ", salesRepresentative=" + salesRepresentative + ", creditStatus=" + creditStatus
				+ ", fax=" + fax + ", institutionalId=" + institutionalId + ", parentInstitutionalId="
				+ parentInstitutionalId + ", chargeTaxOn=" + chargeTaxOn + ", paymentOptions=" + paymentOptions
				+ ", configurationOptionsforOrders=" + configurationOptionsforOrders + ", newOrderCommission="
				+ newOrderCommission + ", renewalCommission=" + renewalCommission + ", paymentThreshold="
				+ paymentThreshold + ", customerAddresses=" + customerAddresses + "]";
	}
	
}