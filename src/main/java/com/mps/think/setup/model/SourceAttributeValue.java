package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="source_attribute_value")
@Entity
public class SourceAttributeValue extends BaseEntity {

	/**
	 * 2
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	 @OneToOne	
	 @JoinColumn(name = "source_attribute_id", referencedColumnName = "id")
     private SourceAttribute SourceAttribute;
	 

	
	@Column(name = "source_attribute_value")
	private String sourceAttributeValue;
	
	@Column(name = "description")
	private String description;
	
	@Column(name="idx")
	private Integer idx;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SourceAttribute getSourceAttribute() {
		return SourceAttribute;
	}

	public void setSourceAttribute(SourceAttribute sourceAttribute) {
		SourceAttribute = sourceAttribute;
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

	public Integer getIdx() {
		return idx;
	}

	public void setIdx(Integer idx) {
		this.idx = idx;
	}

	@Override
	public String toString() {
		return "SourceAttributeValue [id=" + id + ", SourceAttribute=" + SourceAttribute + ", sourceAttributeValue="
				+ sourceAttributeValue + ", description=" + description + ", idx=" + idx + "]";
	}

	
	
	}