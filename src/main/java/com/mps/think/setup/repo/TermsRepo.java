package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.mps.think.setup.model.Terms;

public interface TermsRepo extends JpaRepository<Terms , Integer> {
	public Terms findBytermsId(Integer termsId);

}
