package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "order_auxiliary_information")
@Entity
public class OrderAuxiliaryInformation extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7157530880688318112L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "sales_representative")
	private String salesRepresentative;
	
	@Column(name = "eye_color")
	private String eyeColor;
	
	@Column(name = "height")
	private String height;
	
	@Column(name = "document_reference")
	private String documentReference;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSalesRepresentative() {
		return salesRepresentative;
	}

	public void setSalesRepresentative(String salesRepresentative) {
		this.salesRepresentative = salesRepresentative;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getDocumentReference() {
		return documentReference;
	}

	public void setDocumentReference(String documentReference) {
		this.documentReference = documentReference;
	}

}
