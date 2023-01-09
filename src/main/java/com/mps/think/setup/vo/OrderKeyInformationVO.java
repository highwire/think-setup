package com.mps.think.setup.vo;

import java.util.Date;

public class OrderKeyInformationVO {

	private Integer id;

	private String orderCode;

	private String sourceCode;

	private String orderCategory;

	private String orderStatus;

	private Date orderDate;

	private String purchaseOrder;

	private String agent;

	private Long agentReferenceNum;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getOrderCategory() {
		return orderCategory;
	}

	public void setOrderCategory(String orderCategory) {
		this.orderCategory = orderCategory;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(String purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public Long getAgentReferenceNum() {
		return agentReferenceNum;
	}

	public void setAgentReferenceNum(Long agentReferenceNum) {
		this.agentReferenceNum = agentReferenceNum;
	}

}
