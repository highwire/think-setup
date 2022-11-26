package com.mps.think.setup.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "order_class_mapping")
public class SubOrderClassMapping extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6656195058700200391L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "order_class_id")
	private Integer orderClassId;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "order_codes_id", referencedColumnName = "id")
	private OrderCodes orderCodes;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "order_item_detail_id", referencedColumnName = "id")
	private OrderItemDetails orderItemDetails;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "order_payment_options_id", referencedColumnName = "id")
	private OrderPaymentOptions orderPaymentOptions;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "order_options_id", referencedColumnName = "id")
	private OrderOptions orderOptions;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "order_package_options_id", referencedColumnName = "id")
	private OrderPackageOptions orderPackageOptions;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderClassId() {
		return orderClassId;
	}

	public void setOrderClassId(Integer orderClassId) {
		this.orderClassId = orderClassId;
	}

	public OrderCodes getOrderCodes() {
		return orderCodes;
	}

	public void setOrderCodes(OrderCodes orderCodes) {
		this.orderCodes = orderCodes;
	}

	public OrderItemDetails getOrderItemDetails() {
		return orderItemDetails;
	}

	public void setOrderItemDetails(OrderItemDetails orderItemDetails) {
		this.orderItemDetails = orderItemDetails;
	}

	public OrderPaymentOptions getOrderPaymentOptions() {
		return orderPaymentOptions;
	}

	public void setOrderPaymentOptions(OrderPaymentOptions orderPaymentOptions) {
		this.orderPaymentOptions = orderPaymentOptions;
	}

	public OrderOptions getOrderOptions() {
		return orderOptions;
	}

	public void setOrderOptions(OrderOptions orderOptions) {
		this.orderOptions = orderOptions;
	}

	public OrderPackageOptions getOrderPackageOptions() {
		return orderPackageOptions;
	}

	public void setOrderPackageOptions(OrderPackageOptions orderPackageOptions) {
		this.orderPackageOptions = orderPackageOptions;
	}
}
