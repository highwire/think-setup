package com.mps.think.setup.vo;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.mps.think.setup.utils.AppConstants;

public class SourceFormatVo  {

	
	private Integer id;

	private String sourceFormat;

	private String description;

	private Integer mruSourceFormatSegmentSeq;

//	@Enumerated(EnumType.STRING)
//	private AppConstants.codeGen codeGenType;
	private String codeGenType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSourceFormat() {
		return sourceFormat;
	}

	public void setSourceFormat(String sourceFormat) {
		this.sourceFormat = sourceFormat;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getMruSourceFormatSegmentSeq() {
		return mruSourceFormatSegmentSeq;
	}

	public void setMruSourceFormatSegmentSeq(Integer mruSourceFormatSegmentSeq) {
		this.mruSourceFormatSegmentSeq = mruSourceFormatSegmentSeq;
	}

	
	public String getCodeGenType() {
		return codeGenType;
	}

	public void setCodeGenType(String codeGenType) {
		this.codeGenType = codeGenType;
	}

	@Override
	public String toString() {
		return "SourceFormatVo [id=" + id + ", sourceFormat=" + sourceFormat + ", description=" + description
				+ ", mruSourceFormatSegmentSeq=" + mruSourceFormatSegmentSeq + ", codeGenType=" + codeGenType + "]";
	}


	
}
