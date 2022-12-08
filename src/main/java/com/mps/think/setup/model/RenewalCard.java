package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Table(name = "renewal_card")
@Entity
public class RenewalCard extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "renewal_card_id")
	private Integer renewalCardId;
	
	@OneToOne
	@JoinColumn(name = "pub_id", referencedColumnName = "id")
	private Publisher pubId;
	
	@Column(name = "description")
	private String description;
	
	@Column(name="renewal_card")
	private String renewal_card;

//	need to change integer to order class name and join column with order class id
	@Column(name="oc_id")
	private Integer ocId;

	public Integer getRenewalCardId() {
		return renewalCardId;
	}

	public void setRenewalCardId(Integer renewalCardId) {
		this.renewalCardId = renewalCardId;
	}

	public Publisher getPubId() {
		return pubId;
	}

	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRenewal_card() {
		return renewal_card;
	}

	public void setRenewal_card(String renewal_card) {
		this.renewal_card = renewal_card;
	}

	public Integer getOcId() {
		return ocId;
	}

	public void setOcId(Integer ocId) {
		this.ocId = ocId;
	}

	@Override
	public String toString() {
		return "RenewalCard [renewalCardId=" + renewalCardId + ", pubId=" + pubId + ", description=" + description
				+ ", renewal_card=" + renewal_card + ", ocId=" + ocId + "]";
	}



}
