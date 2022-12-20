package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "sub_child_class")
@Entity
public class SubChildClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subchild_id")
	private Integer subChildId;
	
	@Column(name = "subchild_name")
	private String subChildName;
	
	@OneToOne
	@JoinColumn(name = "child_id", referencedColumnName = "child_id")
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
		return "SubChildClass [subChildId=" + subChildId + ", subChildName=" + subChildName + ", childClassId="
				+ childClassId + "]";
	}
	
	
}
