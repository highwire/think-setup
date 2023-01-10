package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_class_overview")
public class OrderClassOverview extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3356646916676626315L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "parent_id")
	private Integer parentId;
	
	// key information
	
	@Column(name = "label")
	private String label;
	
	@Column(name = "description")
	private String desctiption;
	
	@Column(name = "order_class")
	private String orderClass;
	
	@Column(name = "parent")
	private String parent; // need to change
	
	@Column(name = "revenue_recorded")
	private String revenueRecorded;
	
	@Column(name = "record_revenue_subs")
	private String recordRevenueSubsPartWay;
	
	@Column(name = "cancel_credit")
	private Boolean cancelCredit;
	
	//

	// Source codes
	
	@Column(name = "source_code")
	private String sourceCode;
	
	@Column(name = "source_code_format")
	private String sourceCodeFormat;
	
	@Column(name = "renewal_sc_format")
	private String renewalSCFormat;
	
	//
	
	// payments
	
	@Column(name = "profit_center")
	private String profitCenter;
	
	@Column(name = "payment_threshold")
	private String paymentThreshold;
	
	//
	
	// Other options
	
	@Column(name = "reasonable_gap")
	private String reasonableGap;
	
	@Column(name = "active_order_handling")
	private String activeOrderHandling;
	
	//
	
	@ManyToOne
	@JoinColumn(name = "publisher_id", referencedColumnName = "id")
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
