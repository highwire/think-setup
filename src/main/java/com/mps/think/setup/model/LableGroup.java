package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "lable_groups")
@Entity
public class LableGroup extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1232748709650176114L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lable_group_id")
	private Integer lableGroupId;
	
	@OneToOne
	@JoinColumn(name = "pub_id", referencedColumnName = "id" )
	private Publisher pubId;
	
	@Column(name = "lable_groups")
	private String lableGroups;

	@Column(name = "description")
	private String description;


	public Integer getLableGroupId() {
		return lableGroupId;
	}


	public void setLableGroupId(Integer lableGroupId) {
		this.lableGroupId = lableGroupId;
	}


	public Publisher getPubId() {
		return pubId;
	}


	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}


	public String getLableGroups() {
		return lableGroups;
	}


	public void setLableGroups(String lableGroups) {
		this.lableGroups = lableGroups;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "LableGroup [lableGroupId=" + lableGroupId + ", pubId=" + pubId + ", lableGroups=" + lableGroups
				+ ", description=" + description + "]";
	}
	
}
