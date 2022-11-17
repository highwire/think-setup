package com.mps.think.setup.vo;

import javax.validation.constraints.NotBlank;

import org.springframework.lang.NonNull;

import com.mps.think.setup.model.Publisher;

public class VolumeGroupVO {
	
	private Integer volumeGroupId;

	private Publisher pubId;

	@NotBlank(message = "volume is mandatory")
	@NonNull
	private String volume;

	public Integer getVolumeGroupId() {
		return volumeGroupId;
	}

	public void setVolumeGroupId(Integer volumeGroupId) {
		this.volumeGroupId = volumeGroupId;
	}

	public Publisher getPubId() {
		return pubId;
	}

	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "VolumeGroupVO [volumeGroupId=" + volumeGroupId + ", pubId=" + pubId + ", volume=" + volume + "]";
	}

	

}