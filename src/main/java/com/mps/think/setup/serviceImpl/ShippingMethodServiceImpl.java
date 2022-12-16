package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.ShippingMethod;
import com.mps.think.setup.repo.ShippingMethodRepo;
import com.mps.think.setup.service.ShippingMethodService;
import com.mps.think.setup.vo.ShippingMethodVO;

@Service
public class ShippingMethodServiceImpl implements ShippingMethodService {

	@Autowired
	private ShippingMethodRepo shippingMethodRepo;
	
	@Override
	public List<ShippingMethod> getAllShippingMethods() {
		return shippingMethodRepo.findAll();
	}

	@Override
	public ShippingMethodVO saveShippingMethod(ShippingMethodVO shippingMethod) {
		ShippingMethod newShippingMethod = new ShippingMethod();
		newShippingMethod.setShippingMethod(shippingMethod.getShippingMethod());
		newShippingMethod.setDescription(shippingMethod.getDescription());
		newShippingMethod.setPublisher(shippingMethod.getPublisher());
		shippingMethodRepo.saveAndFlush(newShippingMethod);
		return shippingMethod;
	}

	@Override
	public ShippingMethod getShippingMehtodByid(Integer id) {
		ShippingMethod shippingMethod = shippingMethodRepo.findShippingMethodById(id);
		if (shippingMethod != null) return shippingMethod;
		return null;
	}

	@Override
	public ShippingMethodVO updateShippingMehtod(ShippingMethodVO shippingMethod) {
		ShippingMethod shippingMethodToUpdate = shippingMethodRepo.findShippingMethodById(shippingMethod.getId());
		shippingMethodToUpdate.setShippingMethod(shippingMethod.getShippingMethod() != null ? shippingMethod.getShippingMethod() : shippingMethodToUpdate.getShippingMethod());
		shippingMethodToUpdate.setDescription(shippingMethod.getDescription() != null ? shippingMethod.getDescription() : shippingMethodToUpdate.getDescription());
		shippingMethodToUpdate.setPublisher(shippingMethod.getPublisher() != null ? shippingMethod.getPublisher() : shippingMethodToUpdate.getPublisher());
		shippingMethodRepo.saveAndFlush(shippingMethodToUpdate);
		return shippingMethod;
	}

//	@Override
//	public ShippingMethod deleteShippingMethod(ShippingMethod shippingMethod) {
//		ShippingMethod shippingMethodToDelete = shippingMethodRepo.findShippingMethodById(shippingMethod.getId());
//		shippingMethodRepo.delete(shippingMethodToDelete);
//		return shippingMethod;
//	}

	@Override
	public ShippingMethod deleteShippingMethodById(Integer id) {
		ShippingMethod shippingMethodToDelete = shippingMethodRepo.findShippingMethodById(id);
		shippingMethodRepo.delete(shippingMethodToDelete);
		return shippingMethodToDelete;
	}
	

}
