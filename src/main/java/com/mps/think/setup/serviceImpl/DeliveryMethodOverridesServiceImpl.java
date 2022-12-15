package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.DeliveryMethodOverrides;
import com.mps.think.setup.repo.DeliveryMethodOverridesRepo;
import com.mps.think.setup.service.DeliveryMethodOverridesService;
import com.mps.think.setup.vo.DeliveryMethodOverridesVO;

@Service
public class DeliveryMethodOverridesServiceImpl implements DeliveryMethodOverridesService {

	@Autowired
	private DeliveryMethodOverridesRepo deliveryMethodOverridesRepo;
	
	@Override
	public List<DeliveryMethodOverrides> getAllDeliveryMethodOverrides() {
		return deliveryMethodOverridesRepo.findAll();
	}

	@Override
	public DeliveryMethodOverridesVO saveDeliveryMethodOverrides(DeliveryMethodOverridesVO deliveryMethodOverride) {
		DeliveryMethodOverrides newDeliveryMethodOverride = new DeliveryMethodOverrides();
		newDeliveryMethodOverride.setDeliveryMethod(deliveryMethodOverride.getDeliveryMethod());
		newDeliveryMethodOverride.setRegion(deliveryMethodOverride.getRegion());
		newDeliveryMethodOverride.setCurrency(deliveryMethodOverride.getCurrency());
		newDeliveryMethodOverride.setOrderClass(deliveryMethodOverride.getOrderClass());
		newDeliveryMethodOverride.setAmount(deliveryMethodOverride.getAmount());
		newDeliveryMethodOverride.setPublisher(deliveryMethodOverride.getPublisher());
		deliveryMethodOverridesRepo.saveAndFlush(newDeliveryMethodOverride);
		return deliveryMethodOverride;
	}

	@Override
	public DeliveryMethodOverrides getDeliveryMethodOverrideById(Integer id) {
		return deliveryMethodOverridesRepo.findDeliveryMethodOverrideById(id);
	}

	@Override
	public DeliveryMethodOverridesVO updateDeliveryMethodOverrides(DeliveryMethodOverridesVO deliveryMethod) {
		DeliveryMethodOverrides deliveryMethodOverrideToUpdate = deliveryMethodOverridesRepo.findDeliveryMethodOverrideById(deliveryMethod.getId());
		deliveryMethodOverrideToUpdate.setDeliveryMethod(deliveryMethod.getDeliveryMethod() != null ? deliveryMethod.getDeliveryMethod() : deliveryMethodOverrideToUpdate.getDeliveryMethod());
		deliveryMethodOverrideToUpdate.setRegion(deliveryMethod.getRegion() != null ? deliveryMethod.getRegion() : deliveryMethodOverrideToUpdate.getRegion());
		deliveryMethodOverrideToUpdate.setCurrency(deliveryMethod.getCurrency() != null ? deliveryMethod.getCurrency() : deliveryMethodOverrideToUpdate.getCurrency());
		deliveryMethodOverrideToUpdate.setOrderClass(deliveryMethod.getOrderClass() != null ? deliveryMethod.getOrderClass() : deliveryMethodOverrideToUpdate.getOrderClass());
		deliveryMethodOverrideToUpdate.setAmount(deliveryMethod.getAmount() != null ? deliveryMethod.getAmount() : deliveryMethodOverrideToUpdate.getAmount());
		deliveryMethodOverrideToUpdate.setPublisher(deliveryMethod.getPublisher() != null ? deliveryMethod.getPublisher() : deliveryMethodOverrideToUpdate.getPublisher());
		deliveryMethodOverridesRepo.saveAndFlush(deliveryMethodOverrideToUpdate);
		return deliveryMethod;
	}

	@Override
	public DeliveryMethodOverrides deleteDeliveryMethodOverrideById(Integer id) {
		DeliveryMethodOverrides deliveryMethodOverrideToDelete = deliveryMethodOverridesRepo.findDeliveryMethodOverrideById(id);
		deliveryMethodOverridesRepo.delete(deliveryMethodOverrideToDelete);
		return deliveryMethodOverrideToDelete;
	}

}
