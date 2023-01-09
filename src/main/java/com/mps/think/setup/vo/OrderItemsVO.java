package com.mps.think.setup.vo;

import java.util.Date;

public class OrderItemsVO {

	private Integer id;

	private Integer issue;

	private String enumeration;

	private Integer copiesPerIssue;
	
	private String subsProdPkgDef;
	
	private Date effectiveDate;

	private Integer numOfIssues;
	
	private Date validFrom;
	
	private Date validTo;
	
	private Integer liabilityIssue;
	
	private Integer extendedIssue;
	
	private String term;
	
	private Integer extendedByDays;
	
	private Integer quantityOrdered;


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

	public String getSubsProdPkgDef() {
		return subsProdPkgDef;
	}

	public void setSubsProdPkgDef(String subsProdPkgDef) {
		this.subsProdPkgDef = subsProdPkgDef;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Integer getNumOfIssues() {
		return numOfIssues;
	}

	public void setNumOfIssues(Integer numOfIssues) {
		this.numOfIssues = numOfIssues;
	}

	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public Date getValidTo() {
		return validTo;
	}

	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

	public Integer getLiabilityIssue() {
		return liabilityIssue;
	}

	public void setLiabilityIssue(Integer liabilityIssue) {
		this.liabilityIssue = liabilityIssue;
	}

	public Integer getExtendedIssue() {
		return extendedIssue;
	}

	public void setExtendedIssue(Integer extendedIssue) {
		this.extendedIssue = extendedIssue;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public Integer getExtendedByDays() {
		return extendedByDays;
	}

	public void setExtendedByDays(Integer extendedByDays) {
		this.extendedByDays = extendedByDays;
	}

	public Integer getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(Integer quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

}
