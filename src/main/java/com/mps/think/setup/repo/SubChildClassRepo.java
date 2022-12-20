package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.SubChildClass;

@Repository
public interface SubChildClassRepo extends JpaRepository<SubChildClass, Integer>{

}
