package com.mps.think.setup.vo;

public class CreditStatusVO{

	
	private Integer creditId;
	private PublisherVO pubId;
	private String creditName;
	private String description;
	private Integer badcredit;

	public Integer getCreditId() {
		return creditId;
	}


	public void setCreditId(Integer creditId) {
		this.creditId = creditId;
	}


	public PublisherVO getPubId() {
		return pubId;
	}


	public void setPubId(PublisherVO pubId) {
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