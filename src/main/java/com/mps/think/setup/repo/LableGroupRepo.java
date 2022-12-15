package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.LableGroup;
@Repository
public interface LableGroupRepo extends JpaRepository<LableGroup, Integer> {

}
