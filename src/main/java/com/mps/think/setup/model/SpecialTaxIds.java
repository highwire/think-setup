package com.mps.think.setup.model;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="Special_Tax_IDs")
public class SpecialTaxIds extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	 @OneToOne
	 @JoinColumn(name = "pub_id", referencedColumnName = "id")
	 private Publisher pubId;
	@Column(name="specialTaxIds")
private String specialTaxIds;
	@Column(name="exemptStatus")
private String exemptStatus;
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
	public String getSpecialTaxIds() {
		return specialTaxIds;
	}
	public void setSpecialTaxIds(String specialTaxIds) {
		this.specialTaxIds = specialTaxIds;
	}
	public String getExemptStatus() {
		return exemptStatus;
	}
	public void setExemptStatus(String exemptStatus) {
		this.exemptStatus = exemptStatus;
	}
	@Override
	public String toString() {
		return "SpecialTaxIds [id=" + id + ", pubId=" + pubId + ", specialTaxIds=" + specialTaxIds + ", exemptStatus="
				+ exemptStatus + "]";
	}

	
}
