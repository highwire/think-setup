package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mps.think.setup.vo.EnumModelVO.OrderType;

@Entity
@Table(name = "order_codes")
public class OrderCodes extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7139609851214382595L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "order_code")
	private String orderCode;
	
	@Column(name = "description")
	private String description;
	
	/*
	 * @Enumerated(EnumType.STRING)
	 * 
	 * @Column(name = "order_type") private OrderType orderType;
	 */
	
	@Column(name = "order_type")
	private String orderType;
	
	@Column(name = "order_code_id")
	private String orderCodeId;
	
	@Column(name = "order_class_id")
	private String orderClassId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderCodeId() {
		return orderCodeId;
	}

	public void setOrderCodeId(String orderCodeId) {
		this.orderCodeId = orderCodeId;
	}

	public String getOrderClassId() {
		return orderClassId;
	}

	public void setOrderClassId(String orderClassId) {
		this.orderClassId = orderClassId;
	}

}
