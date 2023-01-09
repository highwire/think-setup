package com.mps.think.setup.vo;

public class OrderDeliveryOptionsVO {

	private Integer id;

	private String deliveryMethod;

	private Boolean proformaPayment;

	private Boolean sendRenewalNotice;

	private Boolean autoRenewal;

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

	public Boolean getSendRenewalNotice() {
		return sendRenewalNotice;
	}

	public void setSendRenewalNotice(Boolean sendRenewalNotice) {
		this.sendRenewalNotice = sendRenewalNotice;
	}

	public Boolean getAutoRenewal() {
		return autoRenewal;
	}

	public void setAutoRenewal(Boolean autoRenewal) {
		this.autoRenewal = autoRenewal;
	}

}
