package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.CreditStatus;
@Repository
public interface CreditStatusRepo extends JpaRepository<CreditStatus, Integer> {

	public CreditStatus findBycreditName(String creditName);

}
