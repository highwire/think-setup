package com.mps.think.setup.vo;

import com.mps.think.setup.model.Publisher;

public class DiscountCardKeyInfoVO {

	private Integer id;

	private Integer orderClassId;

	private Integer parentId;

	private String discountCard;

	private String description;

	private Boolean useForPkg;

	private Publisher publisher;

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

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getDiscountCard() {
		return discountCard;
	}

	public void setDiscountCard(String discountCard) {
		this.discountCard = discountCard;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getUseForPkg() {
		return useForPkg;
	}

	public void setUseForPkg(Boolean useForPkg) {
		this.useForPkg = useForPkg;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

}
