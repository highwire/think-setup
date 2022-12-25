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

@Table(name = "order_parent")
@Entity
public class Order extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3493733554330117672L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private Integer orderId;
	
	@Column(name = "customer_id")
	private Integer customerId;
	
	@Column(name = "order_type")
	private Integer orderType;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "key_order_information_id", referencedColumnName = "id" )
	private OrderKeyInformation keyOrderInformation;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "order_items_id", referencedColumnName = "id" )
	private OrderItems orderItemsAndTerms;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "payment_breakdown_id", referencedColumnName = "id" )
	private PaymentBreakdown paymentBreakdown;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "delivery_options_id", referencedColumnName = "id" )
	private OrderDeliveryOptions deliveryAndBillingOptions;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "order_address_id", referencedColumnName = "id" )
	private OrderAddressMapping orderAddress;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "auxiliary_information_id", referencedColumnName = "id" )
	private OrderAuxiliaryInformation auxiliaryInformation;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public OrderKeyInformation getKeyOrderInformation() {
		return keyOrderInformation;
	}

	public void setKeyOrderInformation(OrderKeyInformation keyOrderInformation) {
		this.keyOrderInformation = keyOrderInformation;
	}

	public OrderItems getOrderItemsAndTerms() {
		return orderItemsAndTerms;
	}

	public void setOrderItemsAndTerms(OrderItems orderItemsAndTerms) {
		this.orderItemsAndTerms = orderItemsAndTerms;
	}

	public PaymentBreakdown getPaymentBreakdown() {
		return paymentBreakdown;
	}

	public void setPaymentBreakdown(PaymentBreakdown paymentBreakdown) {
		this.paymentBreakdown = paymentBreakdown;
	}

	public OrderDeliveryOptions getDeliveryAndBillingOptions() {
		return deliveryAndBillingOptions;
	}

	public void setDeliveryAndBillingOptions(OrderDeliveryOptions deliveryAndBillingOptions) {
		this.deliveryAndBillingOptions = deliveryAndBillingOptions;
	}

	public OrderAddressMapping getOrderAddress() {
		return orderAddress;
	}

	public void setOrderAddress(OrderAddressMapping orderAddress) {
		this.orderAddress = orderAddress;
	}

	public OrderAuxiliaryInformation getAuxiliaryInformation() {
		return auxiliaryInformation;
	}

	public void setAuxiliaryInformation(OrderAuxiliaryInformation auxiliaryInformation) {
		this.auxiliaryInformation = auxiliaryInformation;
	}

}
