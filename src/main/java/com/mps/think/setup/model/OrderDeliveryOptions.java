package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "order_delivery_options")
@Entity
public class OrderDeliveryOptions extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1983213978808409780L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "delivery_method")
	private String deliveryMethod;
	
	@Column(name = "proforma_payment")
	private Boolean proformaPayment;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public Boolean getProformaPayment() {
		return proformaPayment;
	}

	public void setProformaPayment(Boolean proformaPayment) {
		this.proformaPayment = proformaPayment;
	}

}
