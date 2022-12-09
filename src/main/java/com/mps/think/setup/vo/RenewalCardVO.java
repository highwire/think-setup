package com.mps.think.setup.vo;

public class RenewalCardVO {
	private Integer renewalCardId;
	private PublisherVO pubId;
	private Integer ocId;
	private String description;
	private String renewal_card;
	public Integer getRenewalCardId() {
		return renewalCardId;
	}
	public void setRenewalCardId(Integer renewalCardId) {
		this.renewalCardId = renewalCardId;
	}
	public PublisherVO getPubId() {
		return pubId;
	}
	public void setPubId(PublisherVO pubId) {
		this.pubId = pubId;
	}
	public Integer getOcId() {
		return ocId;
	}
	public void setOcId(Integer ocId) {
		this.ocId = ocId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRenewal_card() {
		return renewal_card;
	}
	public void setRenewal_card(String renewal_card) {
		this.renewal_card = renewal_card;
	}
	@Override
	public String toString() {
		return "RenewalCardVO [renewalCardId=" + renewalCardId + ", pubId=" + pubId + ", ocId=" + ocId
				+ ", description=" + description + ", renewal_card=" + renewal_card + "]";
	}

	
}
