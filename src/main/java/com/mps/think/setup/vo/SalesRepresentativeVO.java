package com.mps.think.setup.vo;

public class SalesRepresentativeVO {

	private Integer salesRepID;
	
    private PublisherVO pubId;
	 
	private String salesRepName;
	
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