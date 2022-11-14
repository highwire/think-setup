package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.RentalStatus;
import com.mps.think.setup.repo.RentalStatusRepo;
import com.mps.think.setup.service.RentalStatusService;
import com.mps.think.setup.vo.RentalStatusVO;
@Service
public class RentalStatusServiceImpl implements RentalStatusService {

	@Autowired 
	RentalStatusRepo rentalStatusRepo;
	@Override
	public List<RentalStatus> findAllRentalStatus() {
		return rentalStatusRepo.findAll();
	}

	@Override
	public RentalStatusVO saveRentalStatus(RentalStatusVO rentalStatusVO) {
		RentalStatus data= new RentalStatus();
		data.setRentalcategory(rentalStatusVO.getRentalcategory());
		data.setRentalStatusId(rentalStatusVO.getRentalStatusId());
		data.setRentName(rentalStatusVO.getRentName());
		data.setRentEmail(rentalStatusVO.getRentEmail());
		data.setDescription(rentalStatusVO.getDescription());
		rentalStatusRepo.saveAndFlush(data);
		
		return rentalStatusVO;
	}

	@Override
	public RentalStatusVO updateRentalStatus(RentalStatusVO rentalStatusVO) {
		RentalStatus data= new RentalStatus();
		data.setRentalcategory(rentalStatusVO.getRentalcategory());
		data.setRentalStatusId(rentalStatusVO.getRentalStatusId());
		data.setRentName(rentalStatusVO.getRentName());
		data.setRentEmail(rentalStatusVO.getRentEmail());
		data.setDescription(rentalStatusVO.getDescription());
		rentalStatusRepo.saveAndFlush(data);
		return rentalStatusVO;
	}

	@Override
	public RentalStatus findbyRentalStatusId(Integer rentalStatusId) {
		RentalStatus rentalStatus =rentalStatusRepo.findById(rentalStatusId).get();
		return rentalStatus;
	}

}
