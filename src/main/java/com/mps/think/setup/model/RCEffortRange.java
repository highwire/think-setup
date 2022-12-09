package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "renewal_card_effort_range")
@Entity
public class RCEffortRange extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
//	@OneToOne
//	@JoinColumn(name = "pub_id", referencedColumnName = "id")
//	private Publisher pubId;
	
	@OneToOne
	@JoinColumn(name = "renewal_card_id", referencedColumnName = "renewal_card_id")
	private RenewalCard renewalCardId;
	
	@Column(name = "mru_ren_card_order_code_seq")
	private Integer mru_ren_card_order_code_seq;
	
	@Column(name = "effortFrom")
	private String effortFrom;
	
	@Column(name = "effortTo")
	private String effortTo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

//	public Publisher getPubId() {
//		return pubId;
//	}
//
//	public void setPubId(Publisher pubId) {
//		this.pubId = pubId;
//	}

	public RenewalCard getRenewalCardId() {
		return renewalCardId;
	}

	public void setRenewalCardId(RenewalCard renewalCardId) {
		this.renewalCardId = renewalCardId;
	}

	public Integer getMru_ren_card_order_code_seq() {
		return mru_ren_card_order_code_seq;
	}

	public void setMru_ren_card_order_code_seq(Integer mru_ren_card_order_code_seq) {
		this.mru_ren_card_order_code_seq = mru_ren_card_order_code_seq;
	}

	public String getEffortFrom() {
		return effortFrom;
	}

	public void setEffortFrom(String effortFrom) {
		this.effortFrom = effortFrom;
	}

	public String getEffortTo() {
		return effortTo;
	}

	public void setEffortTo(String effortTo) {
		this.effortTo = effortTo;
	}

	@Override
	public String toString() {
		return "RCEffortRange [id=" + id + ", renewalCardId=" + renewalCardId + ", mru_ren_card_order_code_seq="
				+ mru_ren_card_order_code_seq + ", effortFrom=" + effortFrom + ", effortTo=" + effortTo + "]";
	}

//	@Override
//	public String toString() {
//		return "RCEffortRange [id=" + id + ", pubId=" + pubId + ", renewalCardId=" + renewalCardId
//				+ ", mru_ren_card_order_code_seq=" + mru_ren_card_order_code_seq + ", effortFrom=" + effortFrom
//				+ ", effortTo=" + effortTo + "]";
//	}
	
}
