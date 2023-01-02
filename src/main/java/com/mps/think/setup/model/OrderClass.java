package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "oc")
@Entity
public class OrderClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "oc_id")
	private Integer ocId;
	
	@OneToOne
	@JoinColumn(name = "pub_id", referencedColumnName = "id")
	private Publisher pubId;

	public Integer getOcId() {
		return ocId;
	}

	public void setOcId(Integer ocId) {
		this.ocId = ocId;
	}

	public Publisher getPubId() {
		return pubId;
	}

	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}

	@Override
	public String toString() {
		return "OrderClass [ocId=" + ocId + ", pubId=" + pubId + "]";
	}
	
	
}
