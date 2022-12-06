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

@Table(name = "lable_format_Group")
@Entity
public class LableFormatGroups extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1232748709650176114L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lable_format_group_id")
	private Integer lableFormatGroupId;

	@OneToOne
	@JoinColumn(name = "pub_id", referencedColumnName = "id")
	private Publisher pubId;

	@OneToOne
	@JoinColumn(name = "lableformat_id", referencedColumnName = "lable_format_id")
	private LableFormat lableFormat;

	@OneToOne
	@JoinColumn(name = "lablegroup_id", referencedColumnName = "lable_group_id")
	private LableGroup lablegroup;

	@Column(name = "description")
	private String description;

	public Integer getLableFormatGroupId() {
		return lableFormatGroupId;
	}

	public void setLableFormatGroupId(Integer lableFormatGroupId) {
		this.lableFormatGroupId = lableFormatGroupId;
	}

	public Publisher getPubId() {
		return pubId;
	}

	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}

	public LableFormat getLableFormat() {
		return lableFormat;
	}

	public void setLableFormat(LableFormat lableFormat) {
		this.lableFormat = lableFormat;
	}

	public LableGroup getLablegroup() {
		return lablegroup;
	}

	public void setLablegroup(LableGroup lablegroup) {
		this.lablegroup = lablegroup;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "LableFormatGroups [lableFormatGroupId=" + lableFormatGroupId + ", pubId=" + pubId + ", lableFormat="
				+ lableFormat + ", lablegroup=" + lablegroup + ", description=" + description + "]";
	}

}
