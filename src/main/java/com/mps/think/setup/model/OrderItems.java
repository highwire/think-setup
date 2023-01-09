package com.mps.think.setup.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "order_items")
@Entity
public class OrderItems extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6046375458624234043L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "issue")
	private Integer issue;
	
	@Column(name = "enumeration")
	private String enumeration;
	
	@Column(name = "copies_per_issue")
	private Integer copiesPerIssue;
	
	@Column(name = "subs_prod_pkg_def")
	private String subsProdPkgDef;
	
	@Column(name = "effective_date")
	private Date effectiveDate;

	@Column(name = "num_of_issues")
	private Integer numOfIssues;
	
	@Column(name = "valid_from")
	private Date validFrom;
	
	@Column(name = "valid_to")
	private Date validTo;
	
	@Column(name = "liability_issue")
	private Integer liabilityIssue;
	
	@Column(name = "extended_issue")
	private Integer extendedIssue;
	
	// need to mapped to Term entity
	@Column(name = "term")
	private String term;
	
	@Column(name = "extended_by_days")
	private Integer extendedByDays;
	
	@Column(name = "quantity_ordered")
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
