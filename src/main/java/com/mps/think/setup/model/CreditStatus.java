package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="credit_status")
@Entity
public class CreditStatus extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "credit_id")
	private Integer creditId;
	
	 @OneToOne
	 @JoinColumn(name = "pub_id", referencedColumnName = "id")
    private Publisher pubId;
	 
	@Column(name = "credit_name")
	private String creditName;
	
	@Column(name = "description")
	private String description;
	
	@Column(name="bad_credit")
	private Integer badcredit;

	public Integer getCreditId() {
		return creditId;
	}


	public void setCreditId(Integer creditId) {
		this.creditId = creditId;
	}


	public Publisher getPubId() {
		return pubId;
	}


	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}


	public String getCreditName() {
		return creditName;
	}


	public void setCreditName(String creditName) {
		this.creditName = creditName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Integer getBadcredit() {
		return badcredit;
	}


	public void setBadcredit(Integer badcredit) {
		this.badcredit = badcredit;
	}


	@Override
	public String toString() {
		return "CreditStatus [creditId=" + creditId + ", pubId=" + pubId + ", creditName=" + creditName
				+ ", description=" + description + ", badcredit=" + badcredit + "]";
	}

}
/*
 * CREATE TABLE `THINK_SETUP`.`sales_representative` ( `id` INT NOT NULL,
 * `pubid` INT NULL, `name` VARCHAR(45) NULL, `isactive` TINYINT NULL,
 * `created_by` VARCHAR(45) NULL, `created_At` VARCHAR(45) NULL, `updated_BY`
 * VARCHAR(45) NULL, `updated_at` VARCHAR(45) NULL, PRIMARY KEY (`id`));
 */