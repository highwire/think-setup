package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Table(name = "proft_center")
@Entity
public class ProfitCenter extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "profit_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer proftId;

//	@NonNull
//	@OneToOne
//	@JoinColumn(name = "pub_id", referencedColumnName = "id")
//	private Publisher pubId;

	@NotBlank(message = "Profit Description Name is mandatory")
	@Column(name = "profit_description")
	private String profitDescription;

	@NotNull
	@Column(name = "incl_tax_liab")
	private Integer inclTaxLiab;
	@NotNull
	@Column(name = "incl_del_liab")
	private Integer inclDelLiab;
	@NotNull
	@Column(name = "incl_com_liab")
	private Integer inclComLiab;
	@NotNull
	@Column(name = "incl_tax_ar")
	private Integer inclTaxAr;
	@NotNull
	@Column(name = "incl_del_ar")
	private Integer inclDelAr;

	@NotNull
	@Column(name = "incl_com_ar")
	private Integer inclComAr;

	public Integer getProftId() {
		return proftId;
	}

	public void setProftId(Integer proftId) {
		this.proftId = proftId;
	}

	public String getProfitDescription() {
		return profitDescription;
	}

	public void setProfitDescription(String profitDescription) {
		this.profitDescription = profitDescription;
	}

	public Integer getInclTaxLiab() {
		return inclTaxLiab;
	}

	public void setInclTaxLiab(Integer inclTaxLiab) {
		this.inclTaxLiab = inclTaxLiab;
	}

	public Integer getInclDelLiab() {
		return inclDelLiab;
	}

	public void setInclDelLiab(Integer inclDelLiab) {
		this.inclDelLiab = inclDelLiab;
	}

	public Integer getInclComLiab() {
		return inclComLiab;
	}

	public void setInclComLiab(Integer inclComLiab) {
		this.inclComLiab = inclComLiab;
	}

	public Integer getInclTaxAr() {
		return inclTaxAr;
	}

	public void setInclTaxAr(Integer inclTaxAr) {
		this.inclTaxAr = inclTaxAr;
	}

	public Integer getInclDelAr() {
		return inclDelAr;
	}

	public void setInclDelAr(Integer inclDelAr) {
		this.inclDelAr = inclDelAr;
	}

	public Integer getInclComAr() {
		return inclComAr;
	}

	public void setInclComAr(Integer inclComAr) {
		this.inclComAr = inclComAr;
	}

	@Override
	public String toString() {
		return "ProfitCenter [proftId=" + proftId + ", profitDescription=" + profitDescription + ", inclTaxLiab="
				+ inclTaxLiab + ", inclDelLiab=" + inclDelLiab + ", inclComLiab=" + inclComLiab + ", inclTaxAr="
				+ inclTaxAr + ", inclDelAr=" + inclDelAr + ", inclComAr=" + inclComAr + "]";
	}

}