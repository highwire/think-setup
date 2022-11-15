package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "Customer_category")
@Entity
public class CustomerCategory extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_category_id")
	private Integer CustomerCategoryId;

	@OneToOne
	@JoinColumn(name = "pub_id", referencedColumnName = "id")
	private Publisher pubId;

	@Column(name = "cust_category")
	private String custCategory;

	@Column(name = "think_category")
	private String thinkCategory;

	@Column(name = "status")
	private Integer status;

	
	public Integer getCustomerCategoryId() {
		return CustomerCategoryId;
	}


	public void setCustomerCategoryId(Integer customerCategoryId) {
		CustomerCategoryId = customerCategoryId;
	}


	public Publisher getPubId() {
		return pubId;
	}


	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}


	public String getCustCategory() {
		return custCategory;
	}


	public void setCustCategory(String custCategory) {
		this.custCategory = custCategory;
	}


	public String getThinkCategory() {
		return thinkCategory;
	}


	public void setThinkCategory(String thinkCategory) {
		this.thinkCategory = thinkCategory;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "CustomerCategory [CustomerCategoryId=" + CustomerCategoryId + ", pubId=" + pubId + ", custCategory="
				+ custCategory + ", thinkCategory=" + thinkCategory + ", status=" + status + "]";
	}

}