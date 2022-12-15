package com.mps.think.setup.vo;

public class TaxTypeVO {

	private Integer taxId;

	private PublisherVO pubId;

	private String taxType;

	private String description;

	public Integer getTaxId() {
		return taxId;
	}

	public void setTaxId(Integer taxId) {
		this.taxId = taxId;
	}

	public PublisherVO getPubId() {
		return pubId;
	}

	public void setPubId(PublisherVO pubId) {
		this.pubId = pubId;
	}

	public String getTaxType() {
		return taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "TaxType [taxId=" + taxId + ", pubId=" + pubId + ", taxType=" + taxType + ", description=" + description
				+ "]";
	}

}
