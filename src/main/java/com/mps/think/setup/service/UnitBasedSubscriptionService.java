package com.mps.think.setup.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mps.think.setup.model.UnitBasedSubscription;
import com.mps.think.setup.vo.UnitBasedSubscriptionVO;
@Service
public interface UnitBasedSubscriptionService {
	public List<UnitBasedSubscription> findAllUnitBasedSubscription();

	public UnitBasedSubscriptionVO saveUnitBasedSubscription(UnitBasedSubscriptionVO unitBasedSubscription);

	public UnitBasedSubscriptionVO updateUnitBasedSubscription(UnitBasedSubscriptionVO unitBasedSubscription);

	public UnitBasedSubscription findbyUnitBasedSubscriptionId(Integer unitBasedSubscriptionId);

}
