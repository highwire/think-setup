package com.mps.think.setup.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.serviceImpl.VolumeGroupServiceImpl;
import com.mps.think.setup.vo.VolumeGroupVO;

@RestController
@CrossOrigin
public class VolumeGroupController {
	@Autowired
	VolumeGroupServiceImpl volumeGroupServiceImpl;

	@RequestMapping(value = "/findAllVolumeGroup", method = RequestMethod.GET)
	public ResponseEntity<?> findAllVolumeGroup() {

		return ResponseEntity.ok(volumeGroupServiceImpl.findAllVolumeGroup());
	}

	@RequestMapping(value = "/saveVolumeGroup", method = RequestMethod.POST)
	public ResponseEntity<?> saveVolumeGroup(@Valid @RequestBody VolumeGroupVO volumeGroupVO) {

		return ResponseEntity.ok(volumeGroupServiceImpl.saveVolumeGroup(volumeGroupVO));
	}

	@PostMapping("/updateVolumeGroups")
	public ResponseEntity<?> updateVolumeGroups(@RequestBody VolumeGroupVO volumeGroupVO) {
		return ResponseEntity.ok(volumeGroupServiceImpl.updateVolumeGroup(volumeGroupVO));
	}

	@RequestMapping(value = "/findbyVolumeGroupId", method = RequestMethod.POST)
	public ResponseEntity<?> findbyVolumeGroupId(@Valid @RequestBody Integer volumeGroupId) {

		return ResponseEntity.ok(volumeGroupServiceImpl.findbyVolumeGroupId(volumeGroupId));
	}
	
	@DeleteMapping("/deleteByVolumeGroupId")
	public ResponseEntity<?> deleteByVolumeGroupId(@RequestBody Integer volumeGroupId) {
		return ResponseEntity.ok(volumeGroupServiceImpl.deleteByVolumeGroupId(volumeGroupId));
	}
}
