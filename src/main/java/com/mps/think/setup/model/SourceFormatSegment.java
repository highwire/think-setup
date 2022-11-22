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

	@Column(name = "source_format")
	private Integer sourceFormat;
	
	@Column(name = "mru_source_format_segment_seq")
	private Integer mruSourceFormatSegmentSeq;


	@Enumerated(EnumType.STRING)
	@Column(name = "generation_method")
	private GenerationMethod generationMethod;

	@Column(name = "fixed_value")
	private String fixedValue;

	@Column(name = "gen_func_parm")
	private String genFuncParm;

	@Column(name = "dem_question_id")
	private Integer demQuestionId;

	@Enumerated(EnumType.STRING)
	@Column(name = "generation_function")
	private GenerationFunction generationFunction;

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

	public SourceAttribute getSourceAttribute() {
		return sourceAttribute;
	}

	public void setSourceAttribute(SourceAttribute sourceAttribute) {
		this.sourceAttribute = sourceAttribute;
	}

	public GenerationMethod getGenerationMethod() {
		return generationMethod;
	}

	public void setGenerationMethod(GenerationMethod generationMethod) {
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

	public GenerationFunction getGenerationFunction() {
		return generationFunction;
	}

	public void setGenerationFunction(GenerationFunction generationFunction) {
		this.generationFunction = generationFunction;
	}

	enum GenerationMethod {
		Carry_Through, Fixed_Value, Function
	}

	enum GenerationFunction {
		NA, New_Renewal, Order_Year, Order_Month, Order_Week, Expire_Year, Expire_Month, Expire_Week, Effort_Year,
		Effort_Month, Effort_Week, Effort_Number, Demographic_Response, Region, Test_Sequence
	}

}