package com.mps.think.setup.vo;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.mps.think.setup.utils.AppConstants;

public class SourceFormatSegmentVo {

	private Integer id;

	private SourceAttributeVo sourceAttribute;

	@Enumerated(EnumType.STRING)
	private AppConstants.GenerationMethod generationMethod;

	private String fixedValue;

	private String genFuncParm;

	private Integer demQuestionId;

	@Enumerated(EnumType.STRING)
	private AppConstants.GenerationFunction generationFunction;
	
	private SourceFormatVo SourceFormatVo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SourceAttributeVo getSourceAttribute() {
		return sourceAttribute;
	}

	public void setSourceAttribute(SourceAttributeVo sourceAttribute) {
		this.sourceAttribute = sourceAttribute;
	}

	public String getFixedValue() {
		return fixedValue;
	}

	public void setFixedValue(String fixedValue) {
		this.fixedValue = fixedValue;
	}

	public String getGenFuncParm() {
		return genFuncParm;
	}

	public void setGenFuncParm(String genFuncParm) {
		this.genFuncParm = genFuncParm;
	}

	public Integer getDemQuestionId() {
		return demQuestionId;
	}

	public void setDemQuestionId(Integer demQuestionId) {
		this.demQuestionId = demQuestionId;
	}

	public AppConstants.GenerationMethod getGenerationMethod() {
		return generationMethod;
	}

	public void setGenerationMethod(AppConstants.GenerationMethod generationMethod) {
		this.generationMethod = generationMethod;
	}

	public AppConstants.GenerationFunction getGenerationFunction() {
		return generationFunction;
	}

	public void setGenerationFunction(AppConstants.GenerationFunction generationFunction) {
		this.generationFunction = generationFunction;
	}
	

	public SourceFormatVo getSourceFormatVo() {
		return SourceFormatVo;
	}

	public void setSourceFormatVo(SourceFormatVo sourceFormatVo) {
		SourceFormatVo = sourceFormatVo;
	}

	@Override
	public String toString() {
		return "SourceFormatSegmentVo [id=" + id + ", sourceAttribute=" + sourceAttribute + ", generationMethod="
				+ generationMethod + ", fixedValue=" + fixedValue + ", genFuncParm=" + genFuncParm + ", demQuestionId="
				+ demQuestionId + ", generationFunction=" + generationFunction + ", SourceFormatVo=" + SourceFormatVo
				+ "]";
	}

	
}