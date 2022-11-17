package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.VolumeGroup;
import com.mps.think.setup.vo.VolumeGroupVO;

public interface VolumeGroupService {

	public List<VolumeGroup> findAllVolumeGroup();

	public VolumeGroupVO saveVolumeGroup(VolumeGroupVO VolumeGroupVo);

	public VolumeGroupVO updateVolumeGroup(VolumeGroupVO VolumeGroupVo);

	public VolumeGroup findbyVolumeGroupId(Integer creditId);

}
