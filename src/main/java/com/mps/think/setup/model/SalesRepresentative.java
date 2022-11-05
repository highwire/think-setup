package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="sales_representative")
@Entity
public class SalesRepresentative extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "sales_rep_id")
	private Integer salesRepID;
	
	 @OneToOne
	 @JoinColumn(name = "pub_id", referencedColumnName = "id")
    private Publisher pubId;
	 
	@Column(name = "sales_rep_name")
	private String salesRepName;
	
	@Column(name = "status")
	private Integer status;

	public Integer getSalesRepID() {
		return salesRepID;
	}

	public void setSalesRepID(Integer salesRepID) {
		this.salesRepID = salesRepID;
	}
	

	public Publisher getPubId() {
		return pubId;
	}

	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}

	public String getSalesRepName() {
		return salesRepName;
	}

	public void setSalesRepName(String salesRepName) {
		this.salesRepName = salesRepName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "SalesRepresentative [salesRepID=" + salesRepID + ", pubId=" + pubId + ", salesRepName=" + salesRepName
				+ ", status=" + status + "]";
	}


}
/*
 * CREATE TABLE `THINK_SETUP`.`sales_representative` ( `id` INT NOT NULL,
 * `pubid` INT NULL, `name` VARCHAR(45) NULL, `isactive` TINYINT NULL,
 * `created_by` VARCHAR(45) NULL, `created_At` VARCHAR(45) NULL, `updated_BY`
 * VARCHAR(45) NULL, `updated_at` VARCHAR(45) NULL, PRIMARY KEY (`id`));
 */