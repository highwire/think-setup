package com.mps.think.setup.vo;

public class OrderClassVO {
	
	private OrderCodesVO orderCodes;
	
	private OrderItemDetailsVO orderItemDetails;
	
	private OrderPaymentOptionsVO orderPaymentOptions;
	
	private OrderOptionsVO orderOptions;
	
	private OrderPackageOptionsVO orderPackageOptions;

	public OrderCodesVO getOrderCodes() {
		return orderCodes;
	}

	public void setOrderCodes(OrderCodesVO orderCodes) {
		this.orderCodes = orderCodes;
	}

	public OrderItemDetailsVO getOrderItemDetails() {
		return orderItemDetails;
	}

	public void setOrderItemDetails(OrderItemDetailsVO orderItemDetails) {
		this.orderItemDetails = orderItemDetails;
	}

	public OrderPaymentOptionsVO getOrderPaymentOptions() {
		return orderPaymentOptions;
	}

	public void setOrderPaymentOptions(OrderPaymentOptionsVO orderPaymentOptions) {
		this.orderPaymentOptions = orderPaymentOptions;
	}

	public OrderOptionsVO getOrderOptions() {
		return orderOptions;
	}

	public void setOrderOptions(OrderOptionsVO orderOptions) {
		this.orderOptions = orderOptions;
	}

	public OrderPackageOptionsVO getOrderPackageOptions() {
		return orderPackageOptions;
	}

	public void setOrderPackageOptions(OrderPackageOptionsVO orderPackageOptions) {
		this.orderPackageOptions = orderPackageOptions;
	}
	
}
