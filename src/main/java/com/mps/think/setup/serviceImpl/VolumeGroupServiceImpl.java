package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import com.mps.think.setup.model.CreditStatus;
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
		List<VolumeGroup> volumeGroupList = volumeGroupRepo.findAll();
		if (volumeGroupList.isEmpty()) {
			throw new NotFoundException("No Volume Group present, please add Volume Group!");
		}
		return volumeGroupList;
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
		Optional<VolumeGroup> cs =volumeGroupRepo.findById(creditId);
		if(!cs.isPresent()) {
			throw new NotFoundException("Volume Group Id : "+creditId+" does not exist!");
		}
		return cs.get();
	}

}
