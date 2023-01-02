package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "issue_generation")
public class IssueGeneration extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7139609851214382595L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "number_of_issue")
	private Integer numberOfIssue;

	@Column(name = "frequency_of_generation")
	private String frequencyOfGeneration;

	@Column(name = "periodicity")
	private String periodicity;

	@Column(name = "order_type")
	private String orderType;

	@Column(name = "issues_appear_on_every")
	private String IssuesAppearonEvery;

	@OneToOne
	@JoinColumn(name = "oder_codeId", referencedColumnName = "id")
	private OrderCodes oderCode;

	// oder class mapping will be there
	@Column(name = "order_class_id")
	private String orderClassId;

	@Column(name = "is_active")
	private Boolean active;

	@Column(name = "rate_card")
	private String rateCard;

	@Column(name = "discount_card")
	private String discountCard;

	// enumeration

	@Column(name = "volume_caption")
	private String volumeCaption;

	@Column(name = "volume_format")
	private String volumeFormat;

	@Column(name = "change_date")
	private String changeDate;

	@Column(name = "issue_caption")
	private String issueCaption;

	@Column(name = "issue_format")
	private String issueFormat;

	@Column(name = "issue_volume")
	private String issue_volume;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumberOfIssue() {
		return numberOfIssue;
	}

	public void setNumberOfIssue(Integer numberOfIssue) {
		this.numberOfIssue = numberOfIssue;
	}

	public String getFrequencyOfGeneration() {
		return frequencyOfGeneration;
	}

	public void setFrequencyOfGeneration(String frequencyOfGeneration) {
		this.frequencyOfGeneration = frequencyOfGeneration;
	}

	public String getPeriodicity() {
		return periodicity;
	}

	public void setPeriodicity(String periodicity) {
		this.periodicity = periodicity;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getIssuesAppearonEvery() {
		return IssuesAppearonEvery;
	}

	public void setIssuesAppearonEvery(String issuesAppearonEvery) {
		IssuesAppearonEvery = issuesAppearonEvery;
	}

	public OrderCodes getOderCode() {
		return oderCode;
	}

	public void setOderCode(OrderCodes oderCode) {
		this.oderCode = oderCode;
	}

	public String getOrderClassId() {
		return orderClassId;
	}

	public void setOrderClassId(String orderClassId) {
		this.orderClassId = orderClassId;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getRateCard() {
		return rateCard;
	}

	public void setRateCard(String rateCard) {
		this.rateCard = rateCard;
	}

	public String getDiscountCard() {
		return discountCard;
	}

	public void setDiscountCard(String discountCard) {
		this.discountCard = discountCard;
	}

	public String getVolumeCaption() {
		return volumeCaption;
	}

	public void setVolumeCaption(String volumeCaption) {
		this.volumeCaption = volumeCaption;
	}

	public String getVolumeFormat() {
		return volumeFormat;
	}

	public void setVolumeFormat(String volumeFormat) {
		this.volumeFormat = volumeFormat;
	}

	public String getChangeDate() {
		return changeDate;
	}

	public void setChangeDate(String changeDate) {
		this.changeDate = changeDate;
	}

	public String getIssueCaption() {
		return issueCaption;
	}

	public void setIssueCaption(String issueCaption) {
		this.issueCaption = issueCaption;
	}

	public String getIssueFormat() {
		return issueFormat;
	}

	public void setIssueFormat(String issueFormat) {
		this.issueFormat = issueFormat;
	}

	public String getIssue_volume() {
		return issue_volume;
	}

	public void setIssue_volume(String issue_volume) {
		this.issue_volume = issue_volume;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "IssueGeneration [id=" + id + ", numberOfIssue=" + numberOfIssue + ", frequencyOfGeneration="
				+ frequencyOfGeneration + ", periodicity=" + periodicity + ", orderType=" + orderType
				+ ", IssuesAppearonEvery=" + IssuesAppearonEvery + ", oderCode=" + oderCode + ", orderClassId="
				+ orderClassId + ", active=" + active + ", rateCard=" + rateCard + ", discountCard=" + discountCard
				+ ", volumeCaption=" + volumeCaption + ", volumeFormat=" + volumeFormat + ", changeDate=" + changeDate
				+ ", issueCaption=" + issueCaption + ", issueFormat=" + issueFormat + ", issue_volume=" + issue_volume
				+ "]";
	}

}
