package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "parent_class")
@Entity
public class ParentClass extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8512972382629759954L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "parent_id")
	private Integer parentID;
	
	@Column(name = "parent_name")
	private String parentName;
	
	@OneToOne
	@JoinColumn(name = "oc_id", referencedColumnName = "oc_id")
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
		return "ParentClass [parentID=" + parentID + ", parentName=" + parentName + ", ocId=" + ocId + "]";
	}

}