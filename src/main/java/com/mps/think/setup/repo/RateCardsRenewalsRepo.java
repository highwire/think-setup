package com.mps.think.setup.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.mps.think.setup.model.RateCardsRenewals;


@Repository
public interface RateCardsRenewalsRepo extends JpaRepository<RateCardsRenewals , Integer > {
	
	public Optional<RateCardsRenewals> findById(Integer id);

}
