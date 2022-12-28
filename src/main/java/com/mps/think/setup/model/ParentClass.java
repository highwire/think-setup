package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "parent_class")
@Entity
public class ParentClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "parent_id")
	private Integer parentID;
	
	@Column(name = "parent_name")
	private String parentName;
	
	@Column(name = "label")
	private String label;
	
	@Column(name = "description")
	private String description;
	
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
	
	@OneToOne
	@JoinColumn(name = "oc_id", referencedColumnName = "oc_id")
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
		return "ParentClass [parentID=" + parentID + ", parentName=" + parentName + ", label=" + label
				+ ", description=" + description + ", sourceCode=" + sourceCode + ", sourceCodeFormat="
				+ sourceCodeFormat + ", renewalSCFormat=" + renewalSCFormat + ", profitCenter=" + profitCenter
				+ ", paymentThreshold=" + paymentThreshold + ", reasonableGap=" + reasonableGap + ", ocId=" + ocId
				+ "]";
	}
}