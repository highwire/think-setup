package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.CustomerDetails;
import com.mps.think.setup.repo.CustomerDetailsRepo;
import com.mps.think.setup.service.CustomerDetailsService;
import com.mps.think.setup.vo.CustomerDetailsVO;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {
	
	@Autowired
	private CustomerDetailsRepo customerDetailsRepo;

	@Override
	public List<CustomerDetails> getAllCustomerDetails() {
		return customerDetailsRepo.findAll();
	}

	@Override
	public CustomerDetailsVO saveCustomerDetails(CustomerDetailsVO customerDetails) {
		CustomerDetails cd = new CustomerDetails();
		
//		cd.setCustomerCategory(customerDetails.getCustomerCategory());
		cd.setCustomerCategory(customerDetails.getCustomerCategory());
		cd.setSalutation(customerDetails.getSalutation());
		cd.setFname(customerDetails.getFname());
		cd.setInitialName(customerDetails.getInitialName());
		cd.setLname(customerDetails.getLname());
		cd.setSuffix(customerDetails.getSuffix());
		cd.setCompany(customerDetails.getCompany());
		cd.setDepartment(customerDetails.getDepartment());
		cd.setEmail(customerDetails.getEmail());
		cd.setCountryCode(customerDetails.getCountryCode());
		cd.setPrimaryPhone(customerDetails.getPrimaryPhone());
		cd.setMobileNumber(customerDetails.getMobileNumber());
		cd.setTaxId(customerDetails.getTaxId());
		cd.setTaxExempt(customerDetails.getTaxExempt());
		cd.setSecondaryEmail(customerDetails.getSecondaryEmail());
		cd.setSecondaryPhone(customerDetails.getSecondaryPhone());
		cd.setListRental(customerDetails.getListRental());
		cd.setSalesRepresentative(customerDetails.getSalesRepresentative());
		cd.setCreditStatus(customerDetails.getCreditStatus());
		cd.setFax(customerDetails.getFax());
//=======================================================================================================
		cd.setInstitutionalId(customerDetails.getInstitutionalId());
		cd.setParentInstitutionalId(customerDetails.getParentInstitutionalId());
//==============================================================================================================
		cd.setConfigurationOptionsforOrders(customerDetails.getConfigurationOptionsforOrders());
		cd.setPaymentThreshold(customerDetails.getPaymentThreshold());
		cd.setNewOrderCommission(customerDetails.getNewOrderCommission());
		cd.setRenewalCommission(customerDetails.getRenewalCommission());
		cd.setPaymentOptions(customerDetails.getPaymentOptions());
		cd.setChargeTaxOn(customerDetails.getChargeTaxOn());
//==============================================================================================================			
		customerDetails.setCustomerId(cd.getCustomerId());	
		customerDetailsRepo.saveAndFlush(cd);
		return customerDetails;
	}

	@Override
	public CustomerDetailsVO updateCustomerDetails(CustomerDetailsVO customerDetails) {
		CustomerDetails cd = customerDetailsRepo.findBycustomerId(customerDetails.getCustomerId());
		if (cd == null) {
//			return customerDetails;
			return customerDetails;
		}
		cd.setCustomerCategory(customerDetails.getCustomerCategory());
		cd.setSalutation(customerDetails.getSalutation());
		cd.setFname(customerDetails.getFname());
		cd.setInitialName(customerDetails.getInitialName());
		cd.setLname(customerDetails.getLname());
		cd.setSuffix(customerDetails.getSuffix());
		cd.setCompany(customerDetails.getCompany());
		cd.setDepartment(customerDetails.getDepartment());
		cd.setEmail(customerDetails.getEmail());
		cd.setCountryCode(customerDetails.getCountryCode());
		cd.setPrimaryPhone(customerDetails.getPrimaryPhone());
		cd.setMobileNumber(customerDetails.getMobileNumber());
		cd.setTaxId(customerDetails.getTaxId());
		cd.setTaxExempt(customerDetails.getTaxExempt());
		cd.setSecondaryEmail(customerDetails.getSecondaryEmail());
		cd.setSecondaryPhone(customerDetails.getSecondaryPhone());
		cd.setListRental(customerDetails.getListRental());
		cd.setSalesRepresentative(customerDetails.getSalesRepresentative());
		cd.setCreditStatus(customerDetails.getCreditStatus());
		cd.setFax(customerDetails.getFax());
//=======================================================================================================
		cd.setInstitutionalId(customerDetails.getInstitutionalId());
		cd.setParentInstitutionalId(customerDetails.getParentInstitutionalId());
//==============================================================================================================
		cd.setConfigurationOptionsforOrders(customerDetails.getConfigurationOptionsforOrders());
		cd.setPaymentThreshold(customerDetails.getPaymentThreshold());
		cd.setNewOrderCommission(customerDetails.getNewOrderCommission());
		cd.setRenewalCommission(customerDetails.getRenewalCommission());
		cd.setPaymentOptions(customerDetails.getPaymentOptions());
		cd.setChargeTaxOn(customerDetails.getChargeTaxOn());
		customerDetailsRepo.saveAndFlush(cd);
		return customerDetails;
	}

	@Override
	public CustomerDetails findbyCustomerDetailsId(Integer customerId) {
		 Optional<CustomerDetails> cr = customerDetailsRepo.findById(customerId);
			return cr.get();
	}

}
