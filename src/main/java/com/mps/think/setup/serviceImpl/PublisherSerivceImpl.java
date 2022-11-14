package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.repo.PublisherRepo;
import com.mps.think.setup.service.PublisherSerivce;
import com.mps.think.setup.vo.PublisherVO;
@Service
public class PublisherSerivceImpl implements PublisherSerivce {

	@Autowired 
	PublisherRepo publisherRepo;
	@Override
	public List<Publisher> findAllPublisher() {
		return publisherRepo.findAll();
	}

	@Override
	public PublisherVO savePublisher(PublisherVO publiser) {
		Publisher data = new Publisher();
		data.setName(publiser.getName());
		data.setAbbreviation(publiser.getAbbreviation());
		data.setAddress1(publiser.getAddress1());
		data.setAddress2(publiser.getAddress2());
		data.setCity(publiser.getCity());
		data.setState(publiser.getState());
		data.setCountry(publiser.getCountry());
		data.setIsdCode(publiser.getIsdCode());
		data.setZipCode(publiser.getZipCode());
		data.setPrimaryPhone(publiser.getPrimaryPhone());
		data.setSecondary_Phone(publiser.getSecondaryPhone());
		data.setLogoUrl(publiser.getLogoUrl());
		data.setWebsite(publiser.getWebsite());
		publisherRepo.saveAndFlush(data);
		

		return publiser;
	}

	@Override
	public PublisherVO updatePublisher(PublisherVO publiser) {
		Publisher data = new Publisher();
		data.setName(publiser.getName());
		data.setAbbreviation(publiser.getAbbreviation());
		data.setAddress1(publiser.getAddress1());
		data.setAddress2(publiser.getAddress2());
		data.setCity(publiser.getCity());
		data.setState(publiser.getState());
		data.setCountry(publiser.getCountry());
		data.setIsdCode(publiser.getIsdCode());
		data.setZipCode(publiser.getZipCode());
		data.setPrimaryPhone(publiser.getPrimaryPhone());
		data.setSecondary_Phone(publiser.getSecondaryPhone());
		data.setLogoUrl(publiser.getLogoUrl());
		data.setWebsite(publiser.getWebsite());
		publisherRepo.saveAndFlush(data);
		

		return publiser;
	}

	@Override
	public Publisher findbyPublisherId(Integer id) {
		Publisher publisher= publisherRepo.findById(id).get();
		return publisher;
	}

}
