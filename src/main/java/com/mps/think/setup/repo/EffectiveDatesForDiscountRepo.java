package com.mps.think.setup.repo;

//import java.util.List;

//import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.EffectiveDatesForDiscount;

@Repository
public interface EffectiveDatesForDiscountRepo extends JpaRepository<EffectiveDatesForDiscount, Integer> {

//	public List<EffectiveDatesForDiscount> findByDiscountCardId(Integer discountCardId, Sort sort);
	
}
