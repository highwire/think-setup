package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_package_options")
public class OrderPackageOptions extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8368681123294953547L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "publisher_id")
	private Integer publisherId;
	
	@Column(name = "premium_options")
	private String premiumOptions;
	
	@Column(name = "ship_premium")
	private String shipPremium;
	
	@Column(name = "package_only")
	private Boolean packageOnly;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPremiumOptions() {
		return premiumOptions;
	}

	public void setPremiumOptions(String premiumOptions) {
		this.premiumOptions = premiumOptions;
	}

	public String getShipPremium() {
		return shipPremium;
	}

	public void setShipPremium(String shipPremium) {
		this.shipPremium = shipPremium;
	}

	public Boolean getPackageOnly() {
		return packageOnly;
	}

	public void setPackageOnly(Boolean packageOnly) {
		this.packageOnly = packageOnly;
	}

	public Integer getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}

}
