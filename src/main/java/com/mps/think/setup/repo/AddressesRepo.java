package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.Addresses;

@Repository
public interface AddressesRepo extends JpaRepository< Addresses ,Integer> {
	
	public Addresses findByaddressId(Integer addressId);

}
