package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.CustomerCategory;
import com.mps.think.setup.vo.CustomerCategoryVO;

public interface CustomerCategoryService {

	public List<CustomerCategory> findAllCustomerCategory();

	public CustomerCategoryVO saveCustomerCategory(CustomerCategoryVO customerCategory);

	public CustomerCategoryVO updateCustomerCategory(CustomerCategoryVO customerCategory);

	public CustomerCategory findbyCustomerCategoryId(Integer customerCategoryId);

}
