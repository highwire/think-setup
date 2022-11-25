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

@Table(name = "source_format_segment")
@Entity
public class SourceFormatSegment extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "Source_attribute_id", referencedColumnName = "id")
	private SourceAttribute sourceAttribute;

//	@Column(name = "source_format")
	@OneToOne
	@JoinColumn(name = "Source_format_id", referencedColumnName = "id")
	private SourceFormat sourceFormat;

	@Enumerated(EnumType.STRING)
	@Column(name = "generation_method")
	private AppConstants.GenerationMethod generationMethod;

	@Column(name = "fixed_value")
	private String fixedValue;

	@Column(name = "gen_func_parm")
	private String genFuncParm;

	@Enumerated(EnumType.STRING)
	@Column(name = "generation_function")
	private AppConstants.GenerationFunction generationFunction;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	public SourceAttribute getSourceAttribute() {
		return sourceAttribute;
	}

	public void setSourceAttribute(SourceAttribute sourceAttribute) {
		this.sourceAttribute = sourceAttribute;
	}

	public SourceFormat getSourceFormat() {
		return sourceFormat;
	}

	public void setSourceFormat(SourceFormat sourceFormat) {
		this.sourceFormat = sourceFormat;
	}

	public AppConstants.GenerationMethod getGenerationMethod() {
		return generationMethod;
	}

	public void setGenerationMethod(AppConstants.GenerationMethod generationMethod) {
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

	

	public AppConstants.GenerationFunction getGenerationFunction() {
		return generationFunction;
	}

	public void setGenerationFunction(AppConstants.GenerationFunction generationFunction) {
		this.generationFunction = generationFunction;
	}

	@Override
	public String toString() {
		return "SourceFormatSegment [id=" + id + ", sourceAttribute=" + sourceAttribute + ", sourceFormat="
				+ sourceFormat + ", generationMethod=" + generationMethod + ", fixedValue=" + fixedValue
				+ ", genFuncParm=" + genFuncParm + ", generationFunction=" + generationFunction + "]";
	}

	

}