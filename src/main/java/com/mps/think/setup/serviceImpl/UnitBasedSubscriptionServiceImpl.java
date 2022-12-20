package com.mps.think.setup.serviceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.mps.think.setup.model.UnitBasedSubscription;
import com.mps.think.setup.repo.UnitBasedSubscriptionRepo;
import com.mps.think.setup.service.UnitBasedSubscriptionService;
import com.mps.think.setup.vo.UnitBasedSubscriptionVO;

@Service
public class UnitBasedSubscriptionServiceImpl implements UnitBasedSubscriptionService{

	@Autowired
    private UnitBasedSubscriptionRepo UnitBasedSubscriptionRepo;

	@Override
	public List<UnitBasedSubscription> findAllUnitBasedSubscription() {
		// TODO Auto-generated method stub
		return UnitBasedSubscriptionRepo.findAll();
	}

	@Override
	public UnitBasedSubscriptionVO saveUnitBasedSubscription(UnitBasedSubscriptionVO UnitBasedSubscription) {
		UnitBasedSubscription data=new UnitBasedSubscription();
//		data.setUbsid(UnitBasedSubscription.getUbsid());
		data.setLabel(UnitBasedSubscription.getLabel());
		data.setDiscription(UnitBasedSubscription.getDiscription());
		UnitBasedSubscriptionRepo.saveAndFlush(data);
		return UnitBasedSubscription;
	}

	@Override
	public UnitBasedSubscriptionVO updateUnitBasedSubscription(UnitBasedSubscriptionVO UnitBasedSubscription) {
		for (UnitBasedSubscription curr : UnitBasedSubscriptionRepo.findAll()) {
			if (curr.getUbsid().equals(UnitBasedSubscription.getUbsid())) {
				curr.setDiscription(UnitBasedSubscription.getDiscription());
				curr.setLabel(UnitBasedSubscription.getLabel());
				return UnitBasedSubscription;
			}
			}
		return null;
	}
	
	@Override
	public UnitBasedSubscription findbyUnitBasedSubscriptionId(Integer UnitBasedSubscriptionId) {
		for (UnitBasedSubscription curr : UnitBasedSubscriptionRepo.findAll()) {
			if (curr.getUbsid().equals(UnitBasedSubscriptionId)) {
				return curr;
			}
		}
		return null;
	}

	@Override
	public UnitBasedSubscription deleteByUnitBasedSubscriptionId(Integer ubsid) {
		UnitBasedSubscription delete = findbyUnitBasedSubscriptionId(ubsid);
		UnitBasedSubscriptionRepo.delete(delete);
		return delete;
	}

	
	

}
