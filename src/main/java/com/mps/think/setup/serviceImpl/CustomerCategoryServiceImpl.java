package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mps.think.setup.model.CustomerCategory;
import com.mps.think.setup.repo.CustomerCategoryRepo;
import com.mps.think.setup.service.CustomerCategoryService;
import com.mps.think.setup.vo.CustomerCategoryVO;

public class CustomerCategoryServiceImpl implements CustomerCategoryService {

	@Autowired
	CustomerCategoryRepo CustomerCategoryRepo;
	@Override
	public List<CustomerCategory> findAllCustomerCategory() {
		return CustomerCategoryRepo.findAll();
	}

	@Override
	public CustomerCategoryVO saveCustomerCategory(CustomerCategoryVO creditStatus) {
		return null;
	}

	@Override
	public CustomerCategoryVO updateCustomerCategory(CustomerCategoryVO creditStatus) {
		return null;
	}

	@Override
	public Object findbyCustomerCategoryId(Integer customerCategoryId) {
		return null;
	}

}
