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

import com.mps.think.setup.utils.AppConstants;

@Table(name = "aux_variable")
@Entity
public class AuxVariable extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "aux_var_id")
	private Integer auxVarId;

	@OneToOne
	@JoinColumn(name = "pub_id", referencedColumnName = "id")
	private Publisher pubId;

	@Enumerated(EnumType.STRING)
	@Column(name = "aux_category")
	private AppConstants.AuxCategory auxCategory;

	@Column(name = "variable_name")
	private String variableName;

	@Enumerated(EnumType.STRING)
	@Column(name = "variable_type")
	private AppConstants.VariableType variableType;


	@Column(name = "defult_value")
	private String defultValue;

	@Column(name = "status")
	private Integer auxStatus;

	public Integer getAuxVarId() {
		return auxVarId;
	}

	public void setAuxVarId(Integer auxVarId) {
		this.auxVarId = auxVarId;
	}

	public AppConstants.AuxCategory getAuxCategory() {
		return auxCategory;
	}

	public void setAuxCategory(AppConstants.AuxCategory auxCategory) {
		this.auxCategory = auxCategory;
	}

	public String getVariableName() {
		return variableName;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
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