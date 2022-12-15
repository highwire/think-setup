package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.TransportMode;
import com.mps.think.setup.vo.TransportModeVO;

public interface TransportModeService {

	public TransportModeVO saveTransportMode(TransportModeVO transportMode);
	
	public TransportModeVO updateTransportMode(TransportModeVO transportMode);
	
	public List<TransportMode> getAllTransportModes();
	
	public TransportMode getTransportModeById(Integer id);

	public TransportMode deleteTransportModeById(Integer id);
	
}
