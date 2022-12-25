package com.mps.think.setup.vo;

public class OrderItemsVO {

	private Integer id;

	private Integer issue;

	private String enumeration;

	private Integer copiesPerIssue;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIssue() {
		return issue;
	}

	public void setIssue(Integer issue) {
		this.issue = issue;
	}

	public String getEnumeration() {
		return enumeration;
	}

	public void setEnumeration(String enumeration) {
		this.enumeration = enumeration;
	}

	public Integer getCopiesPerIssue() {
		return copiesPerIssue;
	}

	public void setCopiesPerIssue(Integer copiesPerIssue) {
		this.copiesPerIssue = copiesPerIssue;
	}

}
