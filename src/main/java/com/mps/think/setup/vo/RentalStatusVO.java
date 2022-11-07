package com.mps.think.setup.vo;

public class RentalStatusVO {

	private Integer rentalStatusId;
	private String rentalcategory;

	private String description;

	private Integer rentEmail;

	private Integer rentName;

	public Integer getRentalStatusId() {
		return rentalStatusId;
	}

	public void setRentalStatusId(Integer rentalStatusId) {
		this.rentalStatusId = rentalStatusId;
	}

	public String getRentalcategory() {
		return rentalcategory;
	}

	public void setRentalcategory(String rentalcategory) {
		this.rentalcategory = rentalcategory;
	}

	public Integer getRentEmail() {
		return rentEmail;
	}

	public void setRentEmail(Integer rentEmail) {
		this.rentEmail = rentEmail;
	}

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getRentName() {
		return rentName;
	}

	public void setRentName(Integer rentName) {
		this.rentName = rentName;
	}

	@Override
	public String toString() {
		return "RentalStatus [rentalStatusId=" + rentalStatusId + ", rentalcategory=" + rentalcategory
				+ ", description=" + description + ", rentEmail=" + rentEmail + ", rentName=" + rentName + "]";
	}

}