package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mps.think.setup.model.CommodityCodes;

public interface CommodityCodesRepo extends JpaRepository<CommodityCodes , Integer> {

}
