package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		return CustomerCategoryRepo.findAll();
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
		CustomerCategory cc =CustomerCategoryRepo.findById(customerCategoryId).get();
		return cc;
	}

}
