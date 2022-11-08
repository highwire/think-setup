package com.mps.think.setup.vo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.springframework.lang.NonNull;

public class SalesRepresentativeVO {

	private Integer salesRepID;
	
	@NonNull
	//@NotBlank(message = "Publisher is mandatory in Sales Rep")
	private PublisherVO pubId;
	
	@NotBlank(message = "Sales Rep is mandatory")
	@NonNull
	private String salesRepName;
	
	//@NotBlank(message = "Sales Rep status is mandatory")
	@NonNull
    @Min(1)
	private Integer status;

	public Integer getSalesRepID() {
		return salesRepID;
	}

	public void setSalesRepID(Integer salesRepID) {
		this.salesRepID = salesRepID;
	}

	public PublisherVO getPubId() {
		return pubId;
	}

	public void setPubId(PublisherVO pubId) {
		this.pubId = pubId;
	}

	public String getSalesRepName() {
		return salesRepName;
	}

	public void setSalesRepName(String salesRepName) {
		this.salesRepName = salesRepName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "SalesRepresentative [salesRepID=" + salesRepID + ", pubId=" + pubId + ", salesRepName=" + salesRepName
				+ ", status=" + status + "]";
	}

}