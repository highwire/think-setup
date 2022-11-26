package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.SubOrderClassMapping;

@Repository
public interface OrderCodesRepository extends JpaRepository<SubOrderClassMapping, Integer>{
	
	public SubOrderClassMapping findByOrderClassId(Integer orderClassId);

}
