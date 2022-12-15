package com.mps.think.setup.vo;

import com.mps.think.setup.model.Publisher;

public class LableFormatGroupsVO {

	private Integer lableFormatGroupId;

	private Publisher pubId;

	private LableFormatVO lableFormatVo;

	private LableGroupVO lablegroupVo;

	private String description;

	public Integer getLableFormatGroupId() {
		return lableFormatGroupId;
	}

	public void setLableFormatGroupId(Integer lableFormatGroupId) {
		this.lableFormatGroupId = lableFormatGroupId;
	}

	public Publisher getPubId() {
		return pubId;
	}

	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}

	public LableFormatVO getLableFormatVo() {
		return lableFormatVo;
	}

	public void setLableFormatVo(LableFormatVO lableFormatVo) {
		this.lableFormatVo = lableFormatVo;
	}

	public LableGroupVO getLablegroupVo() {
		return lablegroupVo;
	}

	public void setLablegroupVo(LableGroupVO lablegroupVo) {
		this.lablegroupVo = lablegroupVo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "LableFormatGroupsVO [lableFormatGroupId=" + lableFormatGroupId + ", pubId=" + pubId + ", lableFormatVo="
				+ lableFormatVo + ", lablegroupVo=" + lablegroupVo + ", description=" + description + "]";
	}

}
