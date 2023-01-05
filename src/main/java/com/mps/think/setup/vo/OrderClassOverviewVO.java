package com.mps.think.setup.vo;

import com.mps.think.setup.model.Publisher;

public class OrderClassOverviewVO {

	private Integer id;
	
	private Integer parentId;
	
	// key information
	
	private String label;
	
	private String desctiption;
	
	private String orderClass;
	
	private String parent; // need to change
	
	private String revenueRecorded;
	
	private String recordRevenueSubsPartWay;
	
	private Boolean cancelCredit;
	
	//

	// Source codes
	
	private String sourceCode;
	
	private String sourceCodeFormat;
	
	private String renewalSCFormat;
	
	//
	
	// payments
	
	private String profitCenter;
	
	private String paymentThreshold;
	
	//
	
	// Other options
	
	private String reasonableGap;
	
	private String activeOrderHandling;
	
	//
	
	private Publisher publisher;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDesctiption() {
		return desctiption;
	}

	public void setDesctiption(String desctiption) {
		this.desctiption = desctiption;
	}

	public String getOrderClass() {
		return orderClass;
	}

	public void setOrderClass(String orderClass) {
		this.orderClass = orderClass;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getRevenueRecorded() {
		return revenueRecorded;
	}

	public void setRevenueRecorded(String revenueRecorded) {
		this.revenueRecorded = revenueRecorded;
	}

	public String getRecordRevenueSubsPartWay() {
		return recordRevenueSubsPartWay;
	}

	public void setRecordRevenueSubsPartWay(String recordRevenueSubsPartWay) {
		this.recordRevenueSubsPartWay = recordRevenueSubsPartWay;
	}

	public Boolean getCancelCredit() {
		return cancelCredit;
	}

	public void setCancelCredit(Boolean cancelCredit) {
		this.cancelCredit = cancelCredit;
	}

	public String getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getSourceCodeFormat() {
		return sourceCodeFormat;
	}

	public void setSourceCodeFormat(String sourceCodeFormat) {
		this.sourceCodeFormat = sourceCodeFormat;
	}

	public String getRenewalSCFormat() {
		return renewalSCFormat;
	}

	public void setRenewalSCFormat(String renewalSCFormat) {
		this.renewalSCFormat = renewalSCFormat;
	}

	public String getProfitCenter() {
		return profitCenter;
	}

	public void setProfitCenter(String profitCenter) {
		this.profitCenter = profitCenter;
	}

	public String getPaymentThreshold() {
		return paymentThreshold;
	}

	public void setPaymentThreshold(String paymentThreshold) {
		this.paymentThreshold = paymentThreshold;
	}

	public String getReasonableGap() {
		return reasonableGap;
	}

	public void setReasonableGap(String reasonableGap) {
		this.reasonableGap = reasonableGap;
	}

	public String getActiveOrderHandling() {
		return activeOrderHandling;
	}

	public void setActiveOrderHandling(String activeOrderHandling) {
		this.activeOrderHandling = activeOrderHandling;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	//
	
	
}
