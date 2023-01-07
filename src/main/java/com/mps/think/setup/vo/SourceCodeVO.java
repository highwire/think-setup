package com.mps.think.setup.vo;

import com.mps.think.setup.model.Publisher;
//import com.mps.think.setup.vo.EnumModelVO.Source_code_type;
import com.mps.think.setup.vo.EnumModelVO.source_code_type;

public class SourceCodeVO {
	
	private Integer sourceCodeId;
	private Publisher pubId;
	private String description;
	private String orderCode;
	private String orderCodeType;
	private String quantity;
	private Integer ocId;
	private Boolean isActive;
	private Boolean state_Break;
	private Integer cost;
//	private Boolean generated;
	private Integer generic_agency;
	private Integer is_ddp;
	private source_code_type sCodeType;
	private String sourceCode;
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
	public source_code_type getsCodeType() {
		return sCodeType;
	}
	public void setsCodeType(source_code_type sCodeType) {
		this.sCodeType = sCodeType;
	}
	public String getSourceCode() {
		return sourceCode;
	}
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}
	
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "SourceCodeVO [sourceCodeId=" + sourceCodeId + ", pubId=" + pubId + ", description=" + description
				+ ", orderCode=" + orderCode + ", orderCodeType=" + orderCodeType + ", quantity=" + quantity + ", ocId="
				+ ocId + ", isActive=" + isActive + ", state_Break=" + state_Break + ", cost=" + cost
				+ ", generic_agency=" + generic_agency + ", is_ddp=" + is_ddp + ", sCodeType=" + sCodeType
				+ ", sourceCode=" + sourceCode + "]";
	}
	
}
