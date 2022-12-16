package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_payment_options")
public class OrderPaymentOptions extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4203536690476898705L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "publisher_id")
	private Integer publisherId;
	
	@Column(name = "proforma_options")
	private String proformaOptions;
	
	@Column(name = "credit_card_processing")
	private String creditCardProcessing;
	
	@Column(name = "installment_billing")
	private String installmentBilling;
	
	@Column(name = "prepayment_required")
	private Boolean prepaymentRequired;
	
	@Column(name = "auto_replace")
	private Boolean autoReplace;
	
	@Column(name = "charge_shipping")
	private Boolean chargeShipping;

	@Column(name = "taxable")
	private Boolean taxable;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProformaOptions() {
		return proformaOptions;
	}

	public void setProformaOptions(String proformaOptions) {
		this.proformaOptions = proformaOptions;
	}

	public String getCreditCardProcessing() {
		return creditCardProcessing;
	}

	public void setCreditCardProcessing(String creditCardProcessing) {
		this.creditCardProcessing = creditCardProcessing;
	}

	public String getInstallmentBilling() {
		return installmentBilling;
	}

	public void setInstallmentBilling(String installmentBilling) {
		this.installmentBilling = installmentBilling;
	}

	public Boolean getPrepaymentRequired() {
		return prepaymentRequired;
	}

	public void setPrepaymentRequired(Boolean prepaymentRequired) {
		this.prepaymentRequired = prepaymentRequired;
	}

	public Boolean getAutoReplace() {
		return autoReplace;
	}

	public void setAutoReplace(Boolean autoReplace) {
		this.autoReplace = autoReplace;
	}

	public Boolean getChargeShipping() {
		return chargeShipping;
	}

	public void setChargeShipping(Boolean chargeShipping) {
		this.chargeShipping = chargeShipping;
	}

	public Boolean getTaxable() {
		return taxable;
	}

	public void setTaxable(Boolean taxable) {
		this.taxable = taxable;
	}

	public Integer getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}

}
