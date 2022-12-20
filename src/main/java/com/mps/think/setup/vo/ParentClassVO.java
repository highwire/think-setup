package com.mps.think.setup.vo;


import com.mps.think.setup.model.Publisher;

public class ParentClassVO {
	
	private Integer parentID;
	
	private String parentName;
	
	private Publisher pubId;

	public Integer getParentID() {
		return parentID;
	}

	public void setParentID(Integer parentID) {
		this.parentID = parentID;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public Publisher getPubId() {
		return pubId;
	}

	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}

	@Override
	public String toString() {
		return "ParentClassVO [parentID=" + parentID + ", parentName=" + parentName + ", pubId=" + pubId + "]";
	}
	
	

}
