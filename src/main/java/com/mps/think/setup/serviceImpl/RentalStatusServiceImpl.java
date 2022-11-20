package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

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
		List<RentalStatus> list =rentalStatusRepo.findAll();
		if(list.isEmpty()) {
			throw new NotFoundException("No RentalStatus Present, please add RentalStatus!.");
		}
		return list;
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
		Optional<RentalStatus> rentalStatus =rentalStatusRepo.findById(rentalStatusId);
		if(!rentalStatus.isPresent()) {
			throw new NoSuchElementException("RentalStatus Id : "+rentalStatusId+" does not exist!");
		}
		return rentalStatus.get();
	}

}
