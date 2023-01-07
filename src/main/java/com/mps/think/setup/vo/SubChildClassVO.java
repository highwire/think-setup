package com.mps.think.setup.vo;

import com.mps.think.setup.model.ChildClass;

public class SubChildClassVO {
	
	private Integer subChildId;
	
	private String subChildName;
	
	private String label;
	
	private String description;
	
	private String revenueRecorded;
	
	private String recordRevenuePeriod;
	
	private boolean cancelCreditOnOrderCancel;
	
	private Integer sourceCode;
	
	private Integer sourceCodeFormat;
	
	private Integer renewalSCFormat;
	
	private Integer profitCenter;
	
	private Integer paymentThreshold;
	
	private String reasonableGap;
	
	private String activeOrderHandling;
	
	private ChildClass childClassId;

	public Integer getSubChildId() {
		return subChildId;
	}

	public void setSubChildId(Integer subChildId) {
		this.subChildId = subChildId;
	}

	public String getSubChildName() {
		return subChildName;
	}

	public void setSubChildName(String subChildName) {
		this.subChildName = subChildName;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRevenueRecorded() {
		return revenueRecorded;
	}

	public void setRevenueRecorded(String revenueRecorded) {
		this.revenueRecorded = revenueRecorded;
	}

	public String getRecordRevenuePeriod() {
		return recordRevenuePeriod;
	}

	public void setRecordRevenuePeriod(String recordRevenuePeriod) {
		this.recordRevenuePeriod = recordRevenuePeriod;
	}

	public boolean isCancelCreditOnOrderCancel() {
		return cancelCreditOnOrderCancel;
	}

	public void setCancelCreditOnOrderCancel(boolean cancelCreditOnOrderCancel) {
		this.cancelCreditOnOrderCancel = cancelCreditOnOrderCancel;
	}

	public Integer getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(Integer sourceCode) {
		this.sourceCode = sourceCode;
	}

	public Integer getSourceCodeFormat() {
		return sourceCodeFormat;
	}

	public void setSourceCodeFormat(Integer sourceCodeFormat) {
		this.sourceCodeFormat = sourceCodeFormat;
	}

	public Integer getRenewalSCFormat() {
		return renewalSCFormat;
	}

	public void setRenewalSCFormat(Integer renewalSCFormat) {
		this.renewalSCFormat = renewalSCFormat;
	}

	public Integer getProfitCenter() {
		return profitCenter;
	}

	public void setProfitCenter(Integer profitCenter) {
		this.profitCenter = profitCenter;
	}

	public Integer getPaymentThreshold() {
		return paymentThreshold;
	}

	public void setPaymentThreshold(Integer paymentThreshold) {
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

	public ChildClass getChildClassId() {
		return childClassId;
	}

	public void setChildClassId(ChildClass childClassId) {
		this.childClassId = childClassId;
	}

	@Override
	public String toString() {
		return "SubChildClassVO [subChildId=" + subChildId + ", subChildName=" + subChildName + ", label=" + label
				+ ", description=" + description + ", revenueRecorded=" + revenueRecorded + ", recordRevenuePeriod="
				+ recordRevenuePeriod + ", cancelCreditOnOrderCancel=" + cancelCreditOnOrderCancel + ", sourceCode="
				+ sourceCode + ", sourceCodeFormat=" + sourceCodeFormat + ", renewalSCFormat=" + renewalSCFormat
				+ ", profitCenter=" + profitCenter + ", paymentThreshold=" + paymentThreshold + ", reasonableGap="
				+ reasonableGap + ", activeOrderHandling=" + activeOrderHandling + ", childClassId=" + childClassId
				+ "]";
	}
}
