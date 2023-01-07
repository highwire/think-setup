package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mps.think.setup.model.RateCards;

public interface RateCardsRepo extends JpaRepository<RateCards , Integer> {
	
	public RateCards findByRcId(Integer rcId);

}
