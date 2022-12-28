package com.mps.think.setup.vo;


import com.mps.think.setup.model.OrderClass;

public class ParentClassVO {
	
	private Integer parentID;
	private String parentName;
	private String label;
	private String description;
	private Integer sourceCode;
	private Integer sourceCodeFormat;
	private Integer renewalSCFormat;
	private Integer profitCenter;
	private Integer paymentThreshold;
	private String reasonableGap;
	private OrderClass ocId;
	
	public Integer getParentID() {
		return parentID;
	}
	public void setParentID(Integer parentID) {
		this.parentID = parentID;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
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
	public OrderClass getOcId() {
		return ocId;
	}
	public void setOcId(OrderClass ocId) {
		this.ocId = ocId;
	}
	
	@Override
	public String toString() {
		return "ParentClassVO [parentID=" + parentID + ", parentName=" + parentName + ", label=" + label
				+ ", description=" + description + ", sourceCode=" + sourceCode + ", sourceCodeFormat="
				+ sourceCodeFormat + ", renewalSCFormat=" + renewalSCFormat + ", profitCenter=" + profitCenter
				+ ", paymentThreshold=" + paymentThreshold + ", reasonableGap=" + reasonableGap + ", ocId=" + ocId
				+ "]";
	}
	
}
