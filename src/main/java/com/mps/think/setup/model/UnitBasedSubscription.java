package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "UnitBased_Subscription")
public class UnitBasedSubscription extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer ubsid;

	 @OneToOne
	 @JoinColumn(name = "pub_id", referencedColumnName = "id")
	 private Publisher pubId;

	@Column(name = "label")
	private String label;

	@Column(name = "discription")
	private String discription;

	public Integer getUbsid() {
		return ubsid;
	}

	public void setUbsid(Integer ubsid) {
		this.ubsid = ubsid;
	}

	 public Publisher getPubId() {
	 return pubId;
	 }
	
	 public void setPubId(Publisher pubId) {
	 this.pubId = pubId;
	 }

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	@Override
	public String toString() {
		return "UnitBasedSubscription [ubsid=" + ubsid + ", pubId=" + pubId + ", label=" + label + ", discription="
				+ discription + "]";
	}

	

}
