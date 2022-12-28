package com.mps.think.setup.vo;

import com.mps.think.setup.model.Publisher;

public class OrderClassVO {
	
	private Integer ocId;
	private Publisher pubId;
	public Integer getOcId() {
		return ocId;
	}
	public void setOcId(Integer ocId) {
		this.ocId = ocId;
	}
	public Publisher getPubId() {
		return pubId;
	}
	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}
	@Override
	public String toString() {
		return "OrderClassVO [ocId=" + ocId + ", pubId=" + pubId + "]";
	}
	
}
