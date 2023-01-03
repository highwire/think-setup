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
		return UnitBasedSubscriptionRepo.findAll();
	}

	@Override
	public UnitBasedSubscriptionVO saveUnitBasedSubscription(UnitBasedSubscriptionVO UnitBasedSubscription) {
		UnitBasedSubscription data=new UnitBasedSubscription();
		data.setLabel(UnitBasedSubscription.getLabel());
		data.setDiscription(UnitBasedSubscription.getDiscription());
		Publisher publisher=new Publisher();
		publisher.setId(UnitBasedSubscription.getPubId().getId());
		data.setPubId(publisher);
		UnitBasedSubscriptionRepo.saveAndFlush(data);
		return UnitBasedSubscription;
	}

	@Override
	public UnitBasedSubscriptionVO updateUnitBasedSubscription(UnitBasedSubscriptionVO unitBasedSubscription) {
		UnitBasedSubscription data=new UnitBasedSubscription();
		data.setUbsid(unitBasedSubscription.getUbsid());
		Publisher publisher=new Publisher();
		publisher.setId(unitBasedSubscription.getPubId().getId());
		data.setPubId(publisher);
		data.setLabel(unitBasedSubscription.getLabel());
		data.setDiscription(unitBasedSubscription.getDiscription());
		UnitBasedSubscriptionRepo.saveAndFlush(data);
		return unitBasedSubscription;
	}
	
	@Override
	public UnitBasedSubscription findbyUnitBasedSubscriptionId(Integer UnitBasedSubscriptionId) {
		Optional<UnitBasedSubscription> cr = UnitBasedSubscriptionRepo.findById(UnitBasedSubscriptionId);
		if(!cr.isPresent()) {
			throw new NotFoundException("Unit Based Subscription Id : "+ UnitBasedSubscriptionId +" does not exist!");
		}
		return cr.get();
	}

	@Override
	public UnitBasedSubscription deleteByUnitBasedSubscriptionId(Integer ubsid) {
		UnitBasedSubscription delete = findbyUnitBasedSubscriptionId(ubsid);
		UnitBasedSubscriptionRepo.delete(delete);
		return delete;
	}

	
	

}
