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

@Table(name = "lable_format")
@Entity
public class LableFormat extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1232748709650176114L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lable_format_id")
	private Integer lableFormatId;
	
	@OneToOne
	@JoinColumn(name = "pub_id", referencedColumnName = "id" )
	private Publisher pubId;
	
	@Column(name = "lable_format")
	private String lableFormat;

	@Column(name = "description")
	private String description;


	public Integer getLableFormatId() {
		return lableFormatId;
	}


	public void setLableFormatId(Integer lableFormatId) {
		this.lableFormatId = lableFormatId;
	}


	public Publisher getPubId() {
		return pubId;
	}


	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}


	public String getLableFormat() {
		return lableFormat;
	}


	public void setLableFormat(String lableFormat) {
		this.lableFormat = lableFormat;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "LableFormat [lableFormatId=" + lableFormatId + ", pubId=" + pubId + ", lableFormat=" + lableFormat
				+ ", description=" + description + "]";
	}

}
