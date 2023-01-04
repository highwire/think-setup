package com.mps.think.setup.vo;

import com.mps.think.setup.model.ParentClass;

public class ChildClassVO {

	private Integer childId;
	
	private String childName;
	
	private ParentClass parentId;

	public Integer getChildId() {
		return childId;
	}

	public void setChildId(Integer childId) {
		this.childId = childId;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public ParentClass getParentId() {
		return parentId;
	}

	public void setParentId(ParentClass parentId) {
		this.parentId = parentId;
	}

	@Override
	public String toString() {
		return "ChildClassVO [childId=" + childId + ", childName=" + childName + ", parentId=" + parentId + "]";
	}

	
	
}
