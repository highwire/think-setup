package com.mps.think.setup.vo;

import com.mps.think.setup.model.Publisher;

public class CommodityCodesVO {
	
	private Integer id;
	private Publisher pubId;
	private Integer commodityCode;
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
	public Integer getCommodityCode() {
		return commodityCode;
	}
	public void setCommodityCode(Integer commodityCode) {
		this.commodityCode = commodityCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "CommodityCodesVO [id=" + id + ", pubId=" + pubId + ", commodityCode=" + commodityCode + ", description="
				+ description + "]";
	}
	
	

}
