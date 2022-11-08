package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.CustomerCategory;
import com.mps.think.setup.vo.CustomerCategoryVO;

public interface CustomerCategoryService {

	public List<CustomerCategory> findAllCustomerCategory();

	public CustomerCategoryVO saveCustomerCategory(CustomerCategoryVO creditStatus);

	public CustomerCategoryVO updateCustomerCategory(CustomerCategoryVO creditStatus);

	Object findbyCustomerCategoryId(Integer customerCategoryId);

}
