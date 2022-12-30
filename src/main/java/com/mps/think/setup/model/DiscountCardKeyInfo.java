package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "discount_card_key_information")
public class DiscountCardKeyInfo extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5259099790560317237L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "order_class_id")
	private Integer orderClassId;
	
	@Column(name = "parent_id")
	private Integer parentId;
	
	@Column(name = "discount_card")
	private String discountCard;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "use_for_package")
	private Boolean useForPkg;
	
	@OneToOne
	@JoinColumn(name = "publisher_id", referencedColumnName = "id")
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
