package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.RentalStatus;
import com.mps.think.setup.model.TaxType;
@Repository
public interface RentalStatusRepo extends JpaRepository<RentalStatus, Integer> {
	
	public RentalStatus findByRentalStatusId(Integer rentalStatusid);

}
