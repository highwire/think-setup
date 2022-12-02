package com.mps.think.setup.vo;

public class LableGroupVO {

	private Integer lableGroupId;

	private PublisherVO pubId;

	private String lableGroups;

	private String description;

	public Integer getLableGroupId() {
		return lableGroupId;
	}

	public void setLableGroupId(Integer lableGroupId) {
		this.lableGroupId = lableGroupId;
	}

	public PublisherVO getPubId() {
		return pubId;
	}

	public void setPubId(PublisherVO pubId) {
		this.pubId = pubId;
	}

	public String getLableGroups() {
		return lableGroups;
	}

	public void setLableGroups(String lableGroups) {
		this.lableGroups = lableGroups;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "LableGroup [lableGroupId=" + lableGroupId + ", pubId=" + pubId + ", lableGroups=" + lableGroups
				+ ", description=" + description + "]";
	}

}
