package com.mps.think.setup.vo;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.utils.AppConstants;

public class AuxVariableVO {

	
	private Integer auxVarId;

	private Publisher pubId;

//	@Enumerated(EnumType.STRING)
//	private AppConstants.AuxCategory auxCategory;
	private String auxCategory;

	private String variableName;

	@Enumerated(EnumType.STRING)
	private AppConstants.VariableType variableType;


	private String defultValue;

	private Integer auxStatus;

	public Integer getAuxVarId() {
		return auxVarId;
	}

	public void setAuxVarId(Integer auxVarId) {
		this.auxVarId = auxVarId;
	}

//	public AppConstants.AuxCategory getAuxCategory() {
//		return auxCategory;
//	}
//
//	public void setAuxCategory(AppConstants.AuxCategory auxCategory) {
//		this.auxCategory = auxCategory;
//	}

	public String getVariableName() {
		return variableName;
	}

	public String getAuxCategory() {
		return auxCategory;
	}

	public void setAuxCategory(String auxCategory) {
		this.auxCategory = auxCategory;
	}

	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}

	public AppConstants.VariableType getVariableType() {
		return variableType;
	}

	public void setVariableType(AppConstants.VariableType variableType) {
		this.variableType = variableType;
	}

	public String getDefultValue() {
		return defultValue;
	}

	public void setDefultValue(String defultValue) {
		this.defultValue = defultValue;
	}

	public Integer getAuxStatus() {
		return auxStatus;
	}

	public void setAuxStatus(Integer auxStatus) {
		this.auxStatus = auxStatus;
	}

	public Publisher getPubId() {
		return pubId;
	}

	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}

	@Override
	public String toString() {
		return "AuxVariable [auxVarId=" + auxVarId + ", pubId=" + pubId + ", auxCategory=" + auxCategory
				+ ", variableName=" + variableName + ", variableType=" + variableType + ", defultValue=" + defultValue
				+ ", auxStatus=" + auxStatus + "]";
	}
	
}