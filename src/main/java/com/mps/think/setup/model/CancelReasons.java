package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
import javax.persistence.Table;



@Table(name = "cancel_reasons")
@Entity
public class CancelReasons extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1232748709650176114L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cancelReasonsId")
	private Integer cancelReasonsId;
	
	@OneToOne
	@JoinColumn(name = "pub_id", referencedColumnName = "id" )
	private Publisher pubId;
	
	@Column(name = "cancelReason")
	private String cancelReason;

	@Column(name = "description")
	private String description;
	
	@Column(name = "order_Classes")
	private String ordClasses;

	public Integer getCancelReasonsId() {
		return cancelReasonsId;
	}

	public void setCancelReasonsId(Integer cancelReasonsId) {
		this.cancelReasonsId = cancelReasonsId;
	}

	public Publisher getPubId() {
		return pubId;
	}

	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}

	public String getCancelReason() {
		return cancelReason;
	}

	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOrdClasses() {
		return ordClasses;
	}

	public void setOrdClasses(String ordClasses) {
		this.ordClasses = ordClasses;
	}

	@Override
	public String toString() {
		return "CancelReasons [cancelReasonsId=" + cancelReasonsId + ", pubId=" + pubId + ", cancelReason="
				+ cancelReason + ", description=" + description + ", ordClasses=" + ordClasses + "]";
	}

	

}
