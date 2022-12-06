package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;
import com.mps.think.setup.model.Jurisdictions;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.repo.JurisdictionsRepo;
import com.mps.think.setup.service.JurisdictionsService;
import com.mps.think.setup.vo.JurisdictionsVO;

@Service
public class JurisdictionsServiceImpl implements JurisdictionsService {
	
	@Autowired
	JurisdictionsRepo jurisdictionsRepo;

	@Override
	public List<Jurisdictions> findAllJurisdictions() {
		List<Jurisdictions> jList = jurisdictionsRepo.findAll();
		if (jList.isEmpty()) {
			throw new NotFoundException("No Jurisdictions present, please add Jurisdictions!");
		}
		return jList;
	}

	@Override
	public JurisdictionsVO saveJurisdictions(JurisdictionsVO jurisdictions) {
		Jurisdictions data = new Jurisdictions();
		data.setCity(jurisdictions.getCity());
		data.setCountry(jurisdictions.getCountry());
		data.setStateCode(jurisdictions.getStateCode());
		data.setZipCode(jurisdictions.getZipCode());
		jurisdictions.setId(data.getId());
		Publisher publisher=new Publisher();
		publisher.setId(jurisdictions.getPubId().getId());
		data.setPubId(publisher);
		jurisdictionsRepo.saveAndFlush(data);
		return jurisdictions;
	}

	@Override
	public JurisdictionsVO updateJurisdictions(JurisdictionsVO jurisdictions) {
		Jurisdictions data = new Jurisdictions();
		data.setId(jurisdictions.getId());
		Publisher publisher=new Publisher();
		publisher.setId(jurisdictions.getPubId().getId());
		data.setPubId(publisher);
		data.setCity(jurisdictions.getCity());
		data.setCountry(jurisdictions.getCountry());
		data.setStateCode(jurisdictions.getStateCode());
		data.setZipCode(jurisdictions.getZipCode());
		jurisdictionsRepo.saveAndFlush(data);
		return jurisdictions;
	}

	@Override
	public Jurisdictions findbyId(Integer Id) {
		Optional<Jurisdictions> jl = jurisdictionsRepo.findById(Id);
		if(!jl.isPresent()) {
			throw new NotFoundException("Jurisdictions Id : "+ Id +" does not exist!");
		}
		return jl.get();
	}

}
