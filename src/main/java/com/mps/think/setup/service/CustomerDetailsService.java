package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.CustomerDetails;
import com.mps.think.setup.vo.CustomerDetailsVO;

public interface CustomerDetailsService {
	
	public List<CustomerDetails> getAllCustomerDetails();

	public CustomerDetailsVO saveCustomerDetails(CustomerDetailsVO customerDetails);

	public CustomerDetailsVO updateCustomerDetails(CustomerDetailsVO customerDetails);

	public CustomerDetails findbyCustomerDetailsId(Integer customerId);

}
