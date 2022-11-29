package com.mps.think.setup.vo;

import com.mps.think.setup.model.SourceAttribute;

public class SourceAttributeValueVo{

	
	private Integer id;
	 

	
	private String sourceAttributeValue;
	
	private String description;
	
    private SourceAttribute SourceAttribute;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getSourceAttributeValue() {
		return sourceAttributeValue;
	}

	public void setSourceAttributeValue(String sourceAttributeValue) {
		this.sourceAttributeValue = sourceAttributeValue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public SourceAttribute getSourceAttribute() {
		return SourceAttribute;
	}

	public void setSourceAttribute(SourceAttribute sourceAttribute) {
		SourceAttribute = sourceAttribute;
	}

	@Override
	public String toString() {
		return "SourceAttributeValueVo [id=" + id + ", sourceAttributeValue=" + sourceAttributeValue + ", description="
				+ description + ", SourceAttribute=" + SourceAttribute + "]";
	}



}