package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "commodityCodes")
@Entity
public class CommodityCodes extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5179344869459259816L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "pub_id", referencedColumnName = "id" )
	private Publisher pubId;
	
	@Column(name = "commodityCode")
	private Integer commodityCode;
	
	@Column(name = "description")
	private String description;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Publisher getPubId() {
		return pubId;
	}

	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}

	public Integer getCommodityCode() {
		return commodityCode;
	}

	public void setCommodityCode(Integer commodityCode) {
		this.commodityCode = commodityCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "CommodityCodes [id=" + id + ", pubId=" + pubId + ", commodityCode=" + commodityCode + ", description="
				+ description + "]";
	}

	

}
