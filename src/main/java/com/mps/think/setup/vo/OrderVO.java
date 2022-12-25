package com.mps.think.setup.vo;

public class OrderVO {
	
	private Integer orderId;
	
	private Integer customerId;
	
	private Integer orderType;
	
	private OrderKeyInformationVO keyOrderInformation;
	
	private OrderItemsVO orderItemsAndTerms;
	
	private PaymentBreakdownVO paymentBreakdown;
		
	private OrderDeliveryOptionsVO deliveryAndBillingOptions;
	
	private OrderAddressMappingVO orderAddress;
	
	private OrderAuxiliaryInformationVO auxiliaryInformation;

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

	public OrderKeyInformationVO getKeyOrderInformation() {
		return keyOrderInformation;
	}

	public void setKeyOrderInformation(OrderKeyInformationVO keyOrderInformation) {
		this.keyOrderInformation = keyOrderInformation;
	}

	public OrderItemsVO getOrderItemsAndTerms() {
		return orderItemsAndTerms;
	}

	public void setOrderItemsAndTerms(OrderItemsVO orderItemsAndTerms) {
		this.orderItemsAndTerms = orderItemsAndTerms;
	}

	public PaymentBreakdownVO getPaymentBreakdown() {
		return paymentBreakdown;
	}

	public void setPaymentBreakdown(PaymentBreakdownVO paymentBreakdown) {
		this.paymentBreakdown = paymentBreakdown;
	}

	public OrderDeliveryOptionsVO getDeliveryAndBillingOptions() {
		return deliveryAndBillingOptions;
	}

	public void setDeliveryAndBillingOptions(OrderDeliveryOptionsVO deliveryAndBillingOptions) {
		this.deliveryAndBillingOptions = deliveryAndBillingOptions;
	}

	public OrderAddressMappingVO getOrderAddress() {
		return orderAddress;
	}

	public void setOrderAddress(OrderAddressMappingVO orderAddress) {
		this.orderAddress = orderAddress;
	}

	public OrderAuxiliaryInformationVO getAuxiliaryInformation() {
		return auxiliaryInformation;
	}

	public void setAuxiliaryInformation(OrderAuxiliaryInformationVO auxiliaryInformation) {
		this.auxiliaryInformation = auxiliaryInformation;
	}

}
