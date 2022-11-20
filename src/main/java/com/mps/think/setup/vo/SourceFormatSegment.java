package com.mps.think.setup.vo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "source_format_segment")
@Entity
public class SourceFormatSegment {

	
	private Integer id;


	private Integer mruSourceFormatSegmentSeq;

	private SourceAttributeVo sourceAttribute;

	private String generationMethod;

	private String fixedValue;

	private String genFuncParm;

	private Integer demQuestionId;

	private String generationFunction;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMruSourceFormatSegmentSeq() {
		return mruSourceFormatSegmentSeq;
	}

	public void setMruSourceFormatSegmentSeq(Integer mruSourceFormatSegmentSeq) {
		this.mruSourceFormatSegmentSeq = mruSourceFormatSegmentSeq;
	}

	public SourceAttributeVo getSourceAttribute() {
		return sourceAttribute;
	}

	public void setSourceAttribute(SourceAttributeVo sourceAttribute) {
		this.sourceAttribute = sourceAttribute;
	}

	public String getGenerationMethod() {
		return generationMethod;
	}

	public void setGenerationMethod(String generationMethod) {
		this.generationMethod = generationMethod;
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

	public String getGenerationFunction() {
		return generationFunction;
	}

	public void setGenerationFunction(String generationFunction) {
		this.generationFunction = generationFunction;
	}

	

}