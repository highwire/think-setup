package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "child_class")
@Entity
public class ChildClass extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6887006749375450877L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "child_id")
	private Integer childId;
	
	@Column(name = "child_name")
	private String childName;
	
	@ManyToOne
	@JoinColumn(name = "parent_id", referencedColumnName = "parent_id")
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
		return "ChildClass [childId=" + childId + ", childName=" + childName + ", parentId=" + parentId + "]";
	}
	
}
