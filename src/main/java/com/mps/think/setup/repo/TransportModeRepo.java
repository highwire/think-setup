package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.TransportMode;

@Repository
public interface TransportModeRepo extends JpaRepository<TransportMode, Integer> {

	public TransportMode findTransportModeById(Integer id);
	
}
