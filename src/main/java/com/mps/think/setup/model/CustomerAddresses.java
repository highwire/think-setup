package com.mps.think.setup.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
@Table(name = "customer_addresses")
@Entity
public class CustomerAddresses extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "customer_id")
	private Integer customerId;
	
	@Column(name = "addresses_id")
	private Integer addressesId;

	@Transient
	private List<Addresses> addressess;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getAddressesId() {
		return addressesId;
	}

	public void setAddressesId(Integer addressesId) {
		this.addressesId = addressesId;
	}

	public List<Addresses> getAddressess() {
		return addressess;
	}

	public void setAddressess(List<Addresses> addressess) {
		this.addressess = addressess;
	}

	@Override
	public String toString() {
		return "CustomerAddresses [id=" + id + ", customerId=" + customerId + ", addressesId=" + addressesId
				+ ", addressess=" + addressess + "]";
	}

}
