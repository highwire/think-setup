package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.DeliveryMethods;
import com.mps.think.setup.repo.DeliveryMethodsRepo;
import com.mps.think.setup.service.DeliveryMethodsService;
import com.mps.think.setup.vo.DeliveryMethodsVO;

@Service
public class DeliveryMethodsServiceImpl implements DeliveryMethodsService {

	@Autowired
	private DeliveryMethodsRepo deliveryMethodsRepo;
	
	@Override
	public DeliveryMethodsVO saveDeliveryMethod(DeliveryMethodsVO delivery) {
		DeliveryMethods newDeliveryMethod = new DeliveryMethods();
		newDeliveryMethod.setDefaultDelivery(delivery.getDefaultDelivery());
		newDeliveryMethod.setDeliveryMethod(delivery.getDeliveryMethod());
		newDeliveryMethod.setActive(delivery.getActive());
		newDeliveryMethod.setDescription(delivery.getDescription());
		newDeliveryMethod.setRegionList(delivery.getRegionList());
		newDeliveryMethod.setAmount(delivery.getAmount());
		newDeliveryMethod.setTransportMode(delivery.getTransportMode());
		newDeliveryMethod.setPublisher(delivery.getPublisher());
		deliveryMethodsRepo.saveAndFlush(newDeliveryMethod);
		return delivery;
	}

	@Override
	public List<DeliveryMethods> getAllDeliveryMethods() {
		return deliveryMethodsRepo.findAll();
	}

	@Override
	public DeliveryMethodsVO updateDeliveryMethod(DeliveryMethodsVO delivery) {
		DeliveryMethods deliveryToUpdate = deliveryMethodsRepo.findByDeliveryMethodsId(delivery.getDeliveryMethodsId());
		if (deliveryToUpdate != null) {
			deliveryToUpdate.setDefaultDelivery(delivery.getDefaultDelivery());
			deliveryToUpdate.setDeliveryMethod(delivery.getDeliveryMethod());
			deliveryToUpdate.setActive(delivery.getActive());
			deliveryToUpdate.setDescription(delivery.getDescription());
			deliveryToUpdate.setRegionList(delivery.getRegionList());
			deliveryToUpdate.setAmount(delivery.getAmount());
			deliveryToUpdate.setTransportMode(delivery.getTransportMode());
//			deliveryToUpdate.setPublisher(delivery.getPublisher());
			deliveryMethodsRepo.saveAndFlush(deliveryToUpdate);
			return delivery;
		}
		return null;
	}

	@Override
	public DeliveryMethods getDeliveryMethodById(Integer deliveryMethodsId) {
		return deliveryMethodsRepo.findByDeliveryMethodsId(deliveryMethodsId);
	}

//	@Override
//	public DeliveryMethodsVO deleteDeliveryMethod(DeliveryMethodsVO delivery) {
//		DeliveryMethods deliveryToRemove = deliveryMethodsRepo.findByDeliveryMethodsId(delivery.getDeliveryMethodsId());
//		if (deliveryToRemove != null) {
//			deliveryMethodsRepo.delete(deliveryToRemove);
//		}
//		return delivery;
//	}

	@Override
	public DeliveryMethods deleteDeliveryMethodById(Integer id) {
		DeliveryMethods deliveryToRemove = deliveryMethodsRepo.findByDeliveryMethodsId(id);
		if (deliveryToRemove != null) {
			deliveryMethodsRepo.delete(deliveryToRemove);
		}
		return deliveryToRemove;
	}
	
}
