package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.ChildClass;
@Repository
public interface ChildClassRepo extends JpaRepository<ChildClass, Integer>{

}
