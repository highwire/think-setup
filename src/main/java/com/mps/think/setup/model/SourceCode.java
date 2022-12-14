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


import com.mps.think.setup.vo.EnumModelVO.source_code_type;

@Table(name = "source_Code")
@Entity
public class SourceCode extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1831986296356956427L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sourceCodeId")
	private Integer sourceCodeId;
	
	@OneToOne
	@JoinColumn(name = "pub_id", referencedColumnName = "id")
	private Publisher pubId;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "orderCode")
	private String orderCode;
	
	@Column(name = "orderCodeType")
	private String orderCodeType;
//	=====================================================================================================	
//	need to change integer to order class name and join column with order class id
	@Column(name="oc_id")
	private Integer ocId;
	
	@Column(name = "isActive")
	private Boolean isActive;
	
	@Column(name = "stateBreak")
	private Boolean state_Break;
	
	@Column(name = "cost")
	private Integer cost;
//	
//	@Column(name = "generated")
//	private Boolean generated;
	
	@Column(name="generic_agency")
	private Integer generic_agency;
	
	@Column(name="is_ddp")
	private Integer is_ddp;
	
	@Column(name="sourceCode")
	private String sourceCode;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "sCodeType")
	private source_code_type sCodeType;

	public Integer getSourceCodeId() {
		return sourceCodeId;
	}

	public void setSourceCodeId(Integer sourceCodeId) {
		this.sourceCodeId = sourceCodeId;
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

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderCodeType() {
		return orderCodeType;
	}

	public void setOrderCodeType(String orderCodeType) {
		this.orderCodeType = orderCodeType;
	}

	public Integer getOcId() {
		return ocId;
	}

	public void setOcId(Integer ocId) {
		this.ocId = ocId;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getState_Break() {
		return state_Break;
	}

	public void setState_Break(Boolean state_Break) {
		this.state_Break = state_Break;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public Integer getGeneric_agency() {
		return generic_agency;
	}

	public void setGeneric_agency(Integer generic_agency) {
		this.generic_agency = generic_agency;
	}

	public Integer getIs_ddp() {
		return is_ddp;
	}

	public void setIs_ddp(Integer is_ddp) {
		this.is_ddp = is_ddp;
	}

	public String getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public source_code_type getsCodeType() {
		return sCodeType;
	}

	public void setsCodeType(source_code_type sCodeType) {
		this.sCodeType = sCodeType;
	}

	@Override
	public String toString() {
		return "SourceCode [sourceCodeId=" + sourceCodeId + ", pubId=" + pubId + ", description=" + description
				+ ", orderCode=" + orderCode + ", orderCodeType=" + orderCodeType + ", ocId=" + ocId + ", isActive="
				+ isActive + ", state_Break=" + state_Break + ", cost=" + cost + ", generic_agency=" + generic_agency
				+ ", is_ddp=" + is_ddp + ", sourceCode=" + sourceCode + ", sCodeType=" + sCodeType + "]";
	}

	
	
	
	
	
	
	
	






}
