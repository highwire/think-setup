package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mps.think.setup.model.CancelReasons;

public interface CancelReasonsRepo extends JpaRepository<CancelReasons , Integer> {

}
