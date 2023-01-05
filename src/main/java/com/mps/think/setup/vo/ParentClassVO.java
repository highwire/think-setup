package com.mps.think.setup.vo;


import com.mps.think.setup.model.OrderClass;

public class ParentClassVO {
	
	private Integer parentID;
	private String parentName;
	private OrderClass ocId;
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
	public OrderClass getOcId() {
		return ocId;
	}
	public void setOcId(OrderClass ocId) {
		this.ocId = ocId;
	}
	@Override
	public String toString() {
		return "ParentClassVO [parentID=" + parentID + ", parentName=" + parentName + ", ocId=" + ocId + "]";
	}
	
}
