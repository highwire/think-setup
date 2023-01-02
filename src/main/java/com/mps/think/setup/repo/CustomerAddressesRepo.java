package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mps.think.setup.model.CustomerAddresses;

public interface CustomerAddressesRepo extends JpaRepository<CustomerAddresses, Integer>{

}
