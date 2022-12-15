package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.mps.think.setup.vo.EnumModelVO.InstallmentTerm;
import com.mps.think.setup.vo.EnumModelVO.StartType;
import com.mps.think.setup.vo.EnumModelVO.TimeZone;

@Table(name = "termsTable")
@Entity
public class Terms extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "termsId")
	private Integer termsId;
	
	@OneToOne
	@JoinColumn(name = "pub_id", referencedColumnName = "id" )
	private Publisher pubId;
	
	@Column(name = "term")
	private String term;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "segmented")
	private Boolean segmented;
	
	@Column(name = "segment")
	private Integer segment;

	@Column(name = "unitsPerSegment")
	private Integer unitsPerSegment;
	
	@Column(name = "quantity")
	private Integer quantity;
	
	@Column(name = "duration")
	private Integer duration;
	
	@Column(name = "unitsInDuration")
	private String unitsInDuration;
	
	@Column(name = "volumeGroupsToSpan")
	private String volumeGroupsToSpan;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "startType")
	private StartType startType;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "installmentterm")
	private InstallmentTerm installmentterm;

	public Integer getTermsId() {
		return termsId;
	}

	public void setTermsId(Integer termsId) {
		this.termsId = termsId;
	}

	public Publisher getPubId() {
		return pubId;
	}

	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getSegmented() {
		return segmented;
	}

	public void setSegmented(Boolean segmented) {
		this.segmented = segmented;
	}

	public Integer getSegment() {
		return segment;
	}

	public void setSegment(Integer segment) {
		this.segment = segment;
	}

	public Integer getUnitsPerSegment() {
		return unitsPerSegment;
	}

	public void setUnitsPerSegment(Integer unitsPerSegment) {
		this.unitsPerSegment = unitsPerSegment;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getUnitsInDuration() {
		return unitsInDuration;
	}

	public void setUnitsInDuration(String unitsInDuration) {
		this.unitsInDuration = unitsInDuration;
	}

	public String getVolumeGroupsToSpan() {
		return volumeGroupsToSpan;
	}

	public void setVolumeGroupsToSpan(String volumeGroupsToSpan) {
		this.volumeGroupsToSpan = volumeGroupsToSpan;
	}

	public StartType getStartType() {
		return startType;
	}

	public void setStartType(StartType startType) {
		this.startType = startType;
	}

	public InstallmentTerm getInstallmentterm() {
		return installmentterm;
	}

	public void setInstallmentterm(InstallmentTerm installmentterm) {
		this.installmentterm = installmentterm;
	}

	@Override
	public String toString() {
		return "Terms [termsId=" + termsId + ", pubId=" + pubId + ", term=" + term + ", description=" + description
				+ ", segmented=" + segmented + ", segment=" + segment + ", unitsPerSegment=" + unitsPerSegment
				+ ", quantity=" + quantity + ", duration=" + duration + ", unitsInDuration=" + unitsInDuration
				+ ", volumeGroupsToSpan=" + volumeGroupsToSpan + ", startType=" + startType + ", installmentterm="
				+ installmentterm + "]";
	}
	
	
}
