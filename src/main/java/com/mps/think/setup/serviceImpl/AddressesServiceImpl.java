package com.mps.think.setup.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.Addresses;
import com.mps.think.setup.model.CustomerDetails;
import com.mps.think.setup.repo.AddressesRepo;
import com.mps.think.setup.service.AddressService;
import com.mps.think.setup.vo.AddressesVO;
import com.mps.think.setup.vo.EnumModelVO.Frequency;

@Service
public class AddressesServiceImpl implements AddressService  {
	
	@Autowired
	private AddressesRepo addressRepo;
	
	@Override
	public List<Addresses> getAllAddress() {
		return addressRepo.findAll();
	}

	@Override
	public AddressesVO saveAddresses(AddressesVO addresses) {
		
		Addresses data = new Addresses();
		data.setAddressName(addresses.getAddressName());
		data.setAddressType(addresses.getAddressType());
		data.setAddressCategory(addresses.getAddressCategory());
		data.setStatus(addresses.getStatus());
		data.setPrimaryAddress(addresses.getPrimaryAddress());
		data.setName(addresses.getName());
		data.setAddressLine1(addresses.getAddressLine1());
		data.setAddressLine2(addresses.getAddressLine2());
		data.setZipCode(addresses.getZipCode());
		data.setCity(addresses.getCity());
		data.setState(addresses.getState());
		data.setCountry(addresses.getCountry());
		data.setCountryCode(addresses.getCountryCode());
		data.setPhone(addresses.getPhone());
		data.setValidFrom(addresses.getValidFrom());
		data.setValidTo(addresses.getValidTo());
		data.setFrequency(addresses.getFrequency());
//		data.setSelectionFrom(addresses.getSelectionFrom());
//		data.setSelectionTo(addresses.getSelectionTo());
		if (addresses.getFrequency()==Frequency.EveryYear) {
			data.setSelectionFrom(addresses.getSelectionFrom());
			data.setSelectionTo(addresses.getSelectionTo());
		}
		addresses.setAddressId(data.getAddressId());
		CustomerDetails customerDetails = new CustomerDetails();
		customerDetails.setCustomerId(addresses.getCusId().getCustomerId());
		data.setCusId(customerDetails);
		addressRepo.saveAndFlush(data);
		return addresses;
	}

	@Override
	public AddressesVO updateAddresses(AddressesVO addresses) {
		Addresses data = new Addresses();
		data.setAddressId(addresses.getAddressId());
		CustomerDetails customerDetails = new CustomerDetails();
		customerDetails.setCustomerId(addresses.getCusId().getCustomerId());
		data.setCusId(customerDetails);
		data.setAddressName(addresses.getAddressName());
		data.setAddressType(addresses.getAddressType());
		data.setAddressCategory(addresses.getAddressCategory());
		data.setStatus(addresses.getStatus());
		data.setPrimaryAddress(addresses.getPrimaryAddress());
		data.setName(addresses.getName());
		data.setAddressLine1(addresses.getAddressLine1());
		data.setAddressLine2(addresses.getAddressLine2());
		data.setZipCode(addresses.getZipCode());
		data.setCity(addresses.getCity());
		data.setState(addresses.getState());
		data.setCountry(addresses.getCountry());
		data.setCountryCode(addresses.getCountryCode());
		data.setPhone(addresses.getPhone());
		data.setValidFrom(addresses.getValidFrom());
		data.setValidTo(addresses.getValidTo());
		data.setFrequency(addresses.getFrequency());
		if (addresses.getFrequency()==Frequency.EveryYear) {
		data.setSelectionFrom(addresses.getSelectionFrom());
		data.setSelectionTo(addresses.getSelectionTo());
		}
		addressRepo.saveAndFlush(data);
		return addresses;
	}

	@Override
	public Addresses findbyAddressesId(Integer addressesId) {
		 Optional<Addresses> cr = addressRepo.findById(addressesId);
		return cr.get();
	}

	@Override
	public Addresses deleteByAddressesId(Integer addressesId) {
		Addresses delete = findbyAddressesId(addressesId);
		addressRepo.delete(delete);
		return delete;
	}

	@Override
	public List<Addresses> getAllAddressesByCustomerId(Integer cusId) {
		List<Addresses> output = new ArrayList<>();
		for (Addresses address : addressRepo.findAll()) {
			if (address.getCusId().getCustomerId().equals(cusId)) {
				output.add(address);
			}
		}
		return output;
	}

}
