package com.mps.think.setup.vo;

import com.mps.think.setup.model.RenewalCard;

public class RCEffortRangeVO {

	private Integer id;


	private RenewalCard renewalCardId;

	private String effortFrom;

	private String effortTo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public RenewalCard getRenewalCardId() {
		return renewalCardId;
	}

	public void setRenewalCardId(RenewalCard renewalCardId) {
		this.renewalCardId = renewalCardId;
	}

	public String getEffortFrom() {
		return effortFrom;
	}

	public void setEffortFrom(String effortFrom) {
		this.effortFrom = effortFrom;
	}

	public String getEffortTo() {
		return effortTo;
	}

	public void setEffortTo(String effortTo) {
		this.effortTo = effortTo;
	}

	@Override
	public String toString() {
		return "RCEffortRangeVO [id=" + id + ", renewalCardId=" + renewalCardId + ", effortFrom=" + effortFrom
				+ ", effortTo=" + effortTo + "]";
	}


	
	
}
