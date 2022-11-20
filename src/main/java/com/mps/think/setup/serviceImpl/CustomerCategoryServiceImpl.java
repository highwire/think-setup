package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import com.mps.think.setup.model.CustomerCategory;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.repo.CustomerCategoryRepo;
import com.mps.think.setup.service.CustomerCategoryService;
import com.mps.think.setup.vo.CustomerCategoryVO;
@Service
public class CustomerCategoryServiceImpl implements CustomerCategoryService {

	@Autowired
	CustomerCategoryRepo CustomerCategoryRepo;
	@Override
	public List<CustomerCategory> findAllCustomerCategory() {
		List<CustomerCategory> customerCategory=CustomerCategoryRepo.findAll();
		if(customerCategory.isEmpty()) {
			throw new NotFoundException("Customer Category data not found!");
		}
		return customerCategory;
	}

	@Override
	public CustomerCategoryVO saveCustomerCategory(CustomerCategoryVO customerCategory) {
		CustomerCategory data= new CustomerCategory();
		data.setStatus(customerCategory.getStatus());
		Publisher publisher=new Publisher();
		publisher.setId(customerCategory.getPubId().getId());
		data.setPubId(publisher);
		data.setThinkCategory(customerCategory.getThinkCategory());
		data.setCustCategory(customerCategory.getCustCategory());
		CustomerCategoryRepo.saveAndFlush(data);
		customerCategory.setCustomerCategoryId(data.getCustomerCategoryId());	
		return customerCategory;
	}

	@Override
	public CustomerCategoryVO updateCustomerCategory(CustomerCategoryVO customerCategory) {
		CustomerCategory data= new CustomerCategory();
		data.setCustomerCategoryId(customerCategory.getCustomerCategoryId());
		data.setStatus(customerCategory.getStatus());
		Publisher publisher=new Publisher();
		publisher.setId(customerCategory.getPubId().getId());
		data.setPubId(publisher);
		data.setThinkCategory(customerCategory.getThinkCategory());
		data.setCustCategory(customerCategory.getCustCategory());
		CustomerCategoryRepo.saveAndFlush(data);
		return customerCategory;
	}

	@Override
	public CustomerCategory findbyCustomerCategoryId(Integer customerCategoryId) {
		Optional<CustomerCategory> cc =CustomerCategoryRepo.findById(customerCategoryId);
		if(!cc.isPresent()) {
			throw new NoSuchElementException("Customer Category Id : "+customerCategoryId+" does not exist!");
		}
		return cc.get();
	}

}
