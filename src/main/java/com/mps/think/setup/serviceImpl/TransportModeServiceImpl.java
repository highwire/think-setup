package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.TransportMode;
import com.mps.think.setup.repo.TransportModeRepo;
import com.mps.think.setup.service.TransportModeService;
import com.mps.think.setup.vo.TransportModeVO;

@Service
public class TransportModeServiceImpl implements TransportModeService {

	@Autowired
	private TransportModeRepo transportModeRepo;
	
	@Override
	public TransportModeVO saveTransportMode(TransportModeVO transportMode) {
		TransportMode newTransportMode = new TransportMode();
		newTransportMode.setTransportMode(transportMode.getTransportMode());
		newTransportMode.setPublisher(transportMode.getPublisher());
		transportModeRepo.saveAndFlush(newTransportMode);
		return transportMode;
	}

	@Override
	public TransportModeVO updateTransportMode(TransportModeVO transportMode) {
		TransportMode transportModeToUpdate = transportModeRepo.findTransportModeById(transportMode.getId());
		transportModeToUpdate.setTransportMode(transportMode.getTransportMode() != null ? transportMode.getTransportMode() : transportModeToUpdate.getTransportMode());
		transportModeToUpdate.setPublisher(transportMode.getPublisher() != null ? transportMode.getPublisher() : transportModeToUpdate.getPublisher());
		transportModeRepo.saveAndFlush(transportModeToUpdate);
		return transportMode;
	}

	@Override
	public List<TransportMode> getAllTransportModes() {
		return transportModeRepo.findAll();
	}

	@Override
	public TransportMode getTransportModeById(Integer id) {
		TransportMode transportMode = transportModeRepo.findTransportModeById(id);
		return transportMode;
	}

	@Override
	public TransportMode deleteTransportModeById(Integer id) {
		TransportMode transportModeToDelete = transportModeRepo.findTransportModeById(id);
		transportModeRepo.delete(transportModeToDelete);
		return transportModeToDelete;
	}

}
