package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "volume_group")
@Entity
public class VolumeGroup extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "volume_group_id")
	private Integer volumeGroupId;

	@OneToOne
	@JoinColumn(name = "pub_id", referencedColumnName = "id")
	private Publisher pubId;

	@Column(name = "volume")
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
		return "VolumeGroup [volumeGroupId=" + volumeGroupId + ", pubId=" + pubId + ", volume=" + volume + "]";
	}

}