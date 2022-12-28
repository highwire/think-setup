package com.mps.think.setup.vo;

public class IssueGenerationVo {

	private Integer id;

	private Integer numberOfIssue;

	private String frequencyOfGeneration;

	private String periodicity;

	private String orderType;

	private String IssuesAppearonEvery;

	private OrderCodesVO oderCodeVo;

	private String orderClassId;

	private Boolean active;

	private String rateCard;

	private String discountCard;

	private String volumeCaption;

	private String volumeFormat;

	private String changeDate;

	private String issueCaption;

	private String issueFormat;

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

	public OrderCodesVO getOderCodeVo() {
		return oderCodeVo;
	}

	public void setOderCodeVo(OrderCodesVO oderCodeVo) {
		this.oderCodeVo = oderCodeVo;
	}

	@Override
	public String toString() {
		return "IssueGenerationVo [id=" + id + ", numberOfIssue=" + numberOfIssue + ", frequencyOfGeneration="
				+ frequencyOfGeneration + ", periodicity=" + periodicity + ", orderType=" + orderType
				+ ", IssuesAppearonEvery=" + IssuesAppearonEvery + ", oderCodeVo=" + oderCodeVo + ", orderClassId="
				+ orderClassId + ", active=" + active + ", rateCard=" + rateCard + ", discountCard=" + discountCard
				+ ", volumeCaption=" + volumeCaption + ", volumeFormat=" + volumeFormat + ", changeDate=" + changeDate
				+ ", issueCaption=" + issueCaption + ", issueFormat=" + issueFormat + ", issue_volume=" + issue_volume
				+ "]";
	}

}
