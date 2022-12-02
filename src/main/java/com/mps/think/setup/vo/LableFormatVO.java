package com.mps.think.setup.vo;

public class LableFormatVO {

	private Integer lableFormatId;
	private PublisherVO pubId;
	private String lableFormat;
	private String description;

	public Integer getLableFormatId() {
		return lableFormatId;
	}

	public void setLableFormatId(Integer lableFormatId) {
		this.lableFormatId = lableFormatId;
	}

	public PublisherVO getPubId() {
		return pubId;
	}

	public void setPubId(PublisherVO pubId) {
		this.pubId = pubId;
	}

	public String getLableFormat() {
		return lableFormat;
	}

	public void setLableFormat(String lableFormat) {
		this.lableFormat = lableFormat;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "LableFormat [lableFormatId=" + lableFormatId + ", pubId=" + pubId + ", lableFormat=" + lableFormat
				+ ", description=" + description + "]";
	}

}
