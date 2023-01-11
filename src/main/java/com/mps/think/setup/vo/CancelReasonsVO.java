package com.mps.think.setup.vo;

import com.mps.think.setup.model.Publisher;


public class CancelReasonsVO {
	
	private Integer cancelReasonsId;
	private Publisher pubId;
	private String cancelReason;
	private String description;
	private String ordClasses;
	
	public Integer getCancelReasonsId() {
		return cancelReasonsId;
	}
	public void setCancelReasonsId(Integer cancelReasonsId) {
		this.cancelReasonsId = cancelReasonsId;
	}
	public Publisher getPubId() {
		return pubId;
	}
	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}
	public String getCancelReason() {
		return cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOrdClasses() {
		return ordClasses;
	}
	public void setOrdClasses(String ordClasses) {
		this.ordClasses = ordClasses;
	}
	@Override
	public String toString() {
		return "CancelReasonsVO [cancelReasonsId=" + cancelReasonsId + ", pubId=" + pubId + ", cancelReason="
				+ cancelReason + ", description=" + description + ", ordClasses=" + ordClasses + "]";
	}
	
	
}
