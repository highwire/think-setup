package com.mps.think.setup.vo;

import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.vo.EnumModelVO.InstallmentTerm;
import com.mps.think.setup.vo.EnumModelVO.StartType;

public class TermsVO {
	
	private Integer termsId;
	private Publisher pubId;
	private String term;
	private String description;
	private Boolean segmented;
	private Integer segment;
	private Integer unitsPerSegment;
	private Integer quantity;
	private Integer duration;
	private String unitsInDuration;
	private String volumeGroupsToSpan;
	private StartType startType;
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
		return "TermsVO [termsId=" + termsId + ", pubId=" + pubId + ", term=" + term + ", description=" + description
				+ ", segmented=" + segmented + ", segment=" + segment + ", unitsPerSegment=" + unitsPerSegment
				+ ", quantity=" + quantity + ", duration=" + duration + ", unitsInDuration=" + unitsInDuration
				+ ", volumeGroupsToSpan=" + volumeGroupsToSpan + ", startType=" + startType + ", installmentterm="
				+ installmentterm + "]";
	}

}
