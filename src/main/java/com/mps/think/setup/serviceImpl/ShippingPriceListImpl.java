package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.ShippingPriceList;
import com.mps.think.setup.repo.ShippingPriceListRepo;
import com.mps.think.setup.service.ShippingPriceListService;
import com.mps.think.setup.vo.ShippingPriceListVO;

@Service
public class ShippingPriceListImpl implements ShippingPriceListService {

	@Autowired
	private ShippingPriceListRepo shippingPriceListRepo;
	
	@Override
	public List<ShippingPriceList> findAllShippingPriceList() {
		return shippingPriceListRepo.findAll();
	}

	@Override
	public ShippingPriceListVO saveShippingPriceList(ShippingPriceListVO shippingPriceList) {
		ShippingPriceList newShippingPriceList = new ShippingPriceList();
		newShippingPriceList.setDescription(shippingPriceList.getDescription());
		newShippingPriceList.setShippingPriceList(shippingPriceList.getShippingPriceList());
		newShippingPriceList.setShippingMethod(shippingPriceList.getShippingMethod());
		newShippingPriceList.setPublisher(shippingPriceList.getPublisher());
//		newShippingPriceList.setShippingMethodObj(shippingPriceList.getShippingMethodObj());
		shippingPriceListRepo.saveAndFlush(newShippingPriceList);
		return shippingPriceList;
	}

	@Override
	public ShippingPriceList findShippingPriceListById(Integer id) {
		return shippingPriceListRepo.findShippingPriceListById(id);
	}

	@Override
	public ShippingPriceListVO updateShippingPriceList(ShippingPriceListVO shippingPriceList) {
		ShippingPriceList shippingPriceListToUpdate = shippingPriceListRepo.findShippingPriceListById(shippingPriceList.getId());
		shippingPriceListToUpdate.setShippingPriceList(shippingPriceList.getShippingPriceList() != null ? shippingPriceList.getShippingPriceList() : shippingPriceListToUpdate.getShippingPriceList());
		shippingPriceListToUpdate.setDescription(shippingPriceList.getDescription() != null ? shippingPriceList.getDescription() : shippingPriceListToUpdate.getDescription());
		shippingPriceListToUpdate.setShippingMethod(shippingPriceList.getShippingMethod() != null ? shippingPriceList.getShippingMethod() : shippingPriceListToUpdate.getShippingMethod());
		shippingPriceListToUpdate.setPublisher(shippingPriceList.getPublisher() != null ? shippingPriceList.getPublisher() : shippingPriceListToUpdate.getPublisher());
//		shippingPriceListToUpdate.setShippingMethodObj(shippingPriceList.getShippingMethodObj() != null ? shippingPriceList.getShippingMethodObj() : shippingPriceListToUpdate.getShippingMethodObj());
		shippingPriceListRepo.saveAndFlush(shippingPriceListToUpdate);
		return shippingPriceList;
	}

	@Override
	public ShippingPriceList deleteShippingPriceListById(Integer id) {
		ShippingPriceList shippingPriceListToDelete = shippingPriceListRepo.findShippingPriceListById(id);
		shippingPriceListRepo.delete(shippingPriceListToDelete);
		return shippingPriceListToDelete;
	}

}
