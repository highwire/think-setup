package com.mps.think.setup.vo;

public class CustomerCategoryVO {

	/**
	 * 
	 */
	private Integer CustomerCategoryId;

	private PublisherVO pubId;
	private String custCategory;
	private String thinkCategory;
	private Integer status;

	
	public Integer getCustomerCategoryId() {
		return CustomerCategoryId;
	}


	public void setCustomerCategoryId(Integer customerCategoryId) {
		CustomerCategoryId = customerCategoryId;
	}


	public PublisherVO getPubId() {
		return pubId;
	}


	public void setPubId(PublisherVO pubId) {
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