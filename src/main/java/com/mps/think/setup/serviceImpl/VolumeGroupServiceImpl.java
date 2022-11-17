package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.model.VolumeGroup;
import com.mps.think.setup.repo.VolumeGroupRepo;
import com.mps.think.setup.service.VolumeGroupService;
import com.mps.think.setup.vo.VolumeGroupVO;

@Service
public class VolumeGroupServiceImpl implements VolumeGroupService {

	@Autowired
	VolumeGroupRepo volumeGroupRepo;

	@Override
	public List<VolumeGroup> findAllVolumeGroup() {
		return volumeGroupRepo.findAll();
	}

	@Override
	public VolumeGroupVO saveVolumeGroup(VolumeGroupVO VolumeGroupVo) {
		VolumeGroup volumeGroup = new VolumeGroup();
		volumeGroup.setVolume(VolumeGroupVo.getVolume());
		Publisher publisher = new Publisher();
		publisher.setId(VolumeGroupVo.getPubId().getId());
		volumeGroup.setPubId(publisher);
		volumeGroup = volumeGroupRepo.save(volumeGroup);
		VolumeGroupVo.setVolumeGroupId(volumeGroup.getVolumeGroupId());
		return VolumeGroupVo;
	}

	@Override
	public VolumeGroupVO updateVolumeGroup(VolumeGroupVO VolumeGroupVo) {
		VolumeGroup volumeGroup = new VolumeGroup();
		volumeGroup.setVolumeGroupId(VolumeGroupVo.getVolumeGroupId());
		volumeGroup.setVolume(VolumeGroupVo.getVolume());
		Publisher publisher = new Publisher();
		publisher.setId(VolumeGroupVo.getPubId().getId());
		volumeGroup.setPubId(publisher);
		volumeGroup = volumeGroupRepo.save(volumeGroup);
		return VolumeGroupVo;
	}

	@Override
	public VolumeGroup findbyVolumeGroupId(Integer creditId) {
		return volumeGroupRepo.findById(creditId).get();
	}

}
