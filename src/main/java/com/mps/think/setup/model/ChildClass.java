package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "child_class")
@Entity
public class ChildClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "child_id")
	private Integer childId;
	
	@Column(name = "child_name")
	private String childName;
	
	@Column(name = "label")
	private String label;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "revenue_recorded")
	private String revenueRecorded;
	
	@Column(name = "record_revenue_period")
	private String recordRevenuePeriod;
	
	@Column(name = "cancel_credit_on_order_cancel")
	private boolean cancelCreditOnOrderCancel;
	
	@Column(name = "source_code")
	private Integer sourceCode;
	
	@Column(name = "source_code_format")
	private Integer sourceCodeFormat;
	
	@Column(name = "renewal_sc_format")
	private Integer renewalSCFormat;
	
	@Column(name = "profit_center")
	private Integer profitCenter;
	
	@Column(name = "payment_threshold")
	private Integer paymentThreshold;
	
	@Column(name = "reasonable_gap")
	private String reasonableGap;
	
	@Column(name = "active_order_handling")
	private String activeOrderHandling;
	
	@ManyToOne
	@JoinColumn(name = "parent_id", referencedColumnName = "parent_id")
	private ParentClass parentId;

	public Integer getChildId() {
		return childId;
	}

	public void setChildId(Integer childId) {
		this.childId = childId;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
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

	public ParentClass getParentId() {
		return parentId;
	}

	public void setParentId(ParentClass parentId) {
		this.parentId = parentId;
	}

	@Override
	public String toString() {
		return "ChildClass [childId=" + childId + ", childName=" + childName + ", label=" + label + ", description="
				+ description + ", revenueRecorded=" + revenueRecorded + ", recordRevenuePeriod=" + recordRevenuePeriod
				+ ", cancelCreditOnOrderCancel=" + cancelCreditOnOrderCancel + ", sourceCode=" + sourceCode
				+ ", sourceCodeFormat=" + sourceCodeFormat + ", renewalSCFormat=" + renewalSCFormat + ", profitCenter="
				+ profitCenter + ", paymentThreshold=" + paymentThreshold + ", reasonableGap=" + reasonableGap
				+ ", activeOrderHandling=" + activeOrderHandling + ", parentId=" + parentId + "]";
	}
	
	

	
	
}
