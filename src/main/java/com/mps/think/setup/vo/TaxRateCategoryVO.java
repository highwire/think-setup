package com.mps.think.setup.vo;

import com.mps.think.setup.model.Publisher;

public class TaxRateCategoryVO {
	private Integer id;

	private Publisher pubId;

	private String taxRateCategory;

	private String description;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Publisher getPubId() {
		return pubId;
	}

	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}

	public String getTaxRateCategory() {
		return taxRateCategory;
	}

	public void setTaxRateCategory(String taxRateCategory) {
		this.taxRateCategory = taxRateCategory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "TaxRateCategoryVO [id=" + id + ", pubId=" + pubId + ", taxRateCategory=" + taxRateCategory
				+ ", description=" + description + "]";
	}

}
