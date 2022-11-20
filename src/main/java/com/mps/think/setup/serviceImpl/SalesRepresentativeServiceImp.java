package com.mps.think.setup.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.model.SalesRepresentative;
import com.mps.think.setup.repo.SalesRepresentativeRepo;
import com.mps.think.setup.service.SalesRepresentativeService;
import com.mps.think.setup.vo.SalesRepresentativeVO;

@Service
public class SalesRepresentativeServiceImp implements SalesRepresentativeService {
	@Autowired
	SalesRepresentativeRepo salesRepresentativeRepo;

	@Override
	public List<SalesRepresentative> findAllSalesRepresentative() {
		List<SalesRepresentative> salesRepresentativeList = salesRepresentativeRepo.findAll();
		if(salesRepresentativeList.isEmpty()) {
			throw new NotFoundException("No Sales Representative Present, please add Sales Representative!.");
		}
		return salesRepresentativeList;
	}

	@Override
	public SalesRepresentativeVO saveSalesRepresentative(SalesRepresentativeVO contact) {
		SalesRepresentative SalesRepresentative= new SalesRepresentative();
		SalesRepresentative.setSalesRepName(contact.getSalesRepName());
		SalesRepresentative.setStatus(contact.getStatus());
		Publisher publisher=new Publisher();
		publisher.setId(contact.getPubId().getId());
		SalesRepresentative.setPubId(publisher);
		salesRepresentativeRepo.saveAndFlush(SalesRepresentative);
		contact.setSalesRepID(SalesRepresentative.getSalesRepID());
		return contact;
	}

	@Override
	public SalesRepresentative findbySalesRepresentativeId(Integer contactId) {
		SalesRepresentative salesRepresentative=salesRepresentativeRepo.findById(contactId).get();
		if(salesRepresentative ==null) {
			throw new NoSuchElementException("sales Representative Id : "+contactId+" does not exist!");
		}
		return salesRepresentative;
	}



	@Override
	public SalesRepresentative findbytId(Integer contactId) {
		Optional<SalesRepresentative> salesRepresentative=salesRepresentativeRepo.findById(contactId);
		if(!salesRepresentative.isPresent()) {
			throw new NoSuchElementException("sales Representative Id : "+contactId+" does not exist!");
		}
		return salesRepresentative.get();
	}
	
	public <T> List<T> parseJsonArray(String json, Class<T> clazz) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode tree = objectMapper.readTree(json);
		ArrayList<T> list = new ArrayList<T>();
		  for (JsonNode jsonNode : tree) {
		    list.add(objectMapper.treeToValue(jsonNode, clazz));
		  }
		  System.out.println(list);
		  return list;
		}

}
