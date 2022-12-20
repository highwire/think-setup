package com.mps.think.setup.vo;

import com.mps.think.setup.model.ChildClass;

public class SubChildClassVO {
	
	private Integer subChildId;
	
	private String subChildName;
	
	private ChildClass childClassId;

	public Integer getSubChildId() {
		return subChildId;
	}

	public void setSubChildId(Integer subChildId) {
		this.subChildId = subChildId;
	}

	public String getSubChildName() {
		return subChildName;
	}

	public void setSubChildName(String subChildName) {
		this.subChildName = subChildName;
	}

	public ChildClass getChildClassId() {
		return childClassId;
	}

	public void setChildClassId(ChildClass childClassId) {
		this.childClassId = childClassId;
	}

	@Override
	public String toString() {
		return "SubChildClassVO [subChildId=" + subChildId + ", subChildName=" + subChildName + ", childClassId="
				+ childClassId + "]";
	}
}
