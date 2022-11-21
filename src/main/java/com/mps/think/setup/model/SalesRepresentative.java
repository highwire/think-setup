package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.lang.NonNull;

@Table(name = "sales_representative")
@Entity
public class SalesRepresentative extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "sales_rep_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer salesRepID;

	@NonNull
	@OneToOne
	@JoinColumn(name = "pub_id", referencedColumnName = "id")
	private Publisher pubId;
	
	@NotBlank(message = "Sales Rep Name is mandatory")
	@Column(name = "sales_rep_name")
	private String salesRepName;
	
	@NotNull
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