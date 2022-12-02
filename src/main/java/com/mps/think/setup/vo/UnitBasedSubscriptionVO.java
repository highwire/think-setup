package com.mps.think.setup.vo;

import com.mps.think.setup.model.Publisher;

public class UnitBasedSubscriptionVO {
	private Integer ubsid;
	private Publisher pubId;
	private String label;
	private String discription;

	public Integer getUbsid() {
		return ubsid;
	}
	public void setUbsid(Integer ubsid) {
		this.ubsid = ubsid;
	}
	public Publisher getPubId() {
		return pubId;
	}
	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	@Override
	public String toString() {
		return "UnitBasedSubscriptionVO [ubsid=" + ubsid + ", pubId=" + pubId + ", label=" + label + ", discription="
				+ discription + "]";
	}
	
	
	
}
