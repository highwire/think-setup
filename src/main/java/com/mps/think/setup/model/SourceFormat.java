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

@Table(name = "source_format")
@Entity
public class SourceFormat extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "source_format")
	private String sourceFormat;

	@Column(name = "description")
	private String description;

	@Column(name = "mru_source_format_segment_seq")
	private Integer mruSourceFormatSegmentSeq;

	@Enumerated(EnumType.STRING)
	@Column(name = "code_gen_type")
	private codeGen codeGenType;

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

	public codeGen getCodeGenType() {
		return codeGenType;
	}

	public void setCodeGenType(codeGen codeGenType) {
		this.codeGenType = codeGenType;
	}

	enum codeGen {
		None, Renewals, Promotions
	}

}
