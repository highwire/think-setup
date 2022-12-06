package com.mps.think.setup.vo;

import com.mps.think.setup.model.Publisher;

public class SpecialTaxIdsVO {
	private Integer id;
	private Publisher pubId;
	private String specialTaxIds;
	private String exemptStatus;
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
	public String getSpecialTaxIds() {
		return specialTaxIds;
	}
	public void setSpecialTaxIds(String specialTaxIds) {
		this.specialTaxIds = specialTaxIds;
	}
	public String getExemptStatus() {
		return exemptStatus;
	}
	public void setExemptStatus(String exemptStatus) {
		this.exemptStatus = exemptStatus;
	}
	@Override
	public String toString() {
		return "SpecialTaxIdsVO [id=" + id + ", pubId=" + pubId + ", specialTaxIds=" + specialTaxIds + ", exemptStatus="
				+ exemptStatus + "]";
	}
	
	
}
