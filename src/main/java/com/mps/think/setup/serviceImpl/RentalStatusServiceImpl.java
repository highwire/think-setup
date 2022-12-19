package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import com.mps.think.setup.model.RentalStatus;
import com.mps.think.setup.model.TaxType;
import com.mps.think.setup.repo.RentalStatusRepo;
import com.mps.think.setup.service.RentalStatusService;
import com.mps.think.setup.vo.RentalStatusVO;
@Service
public class RentalStatusServiceImpl implements RentalStatusService {

	@Autowired 
	RentalStatusRepo rentalStatusRepo;
	@Override
	public List<RentalStatus> findAllRentalStatus() {
		List<RentalStatus> ccList = rentalStatusRepo.findAll();
		if (ccList.isEmpty()) {
			throw new NotFoundException("No Rental Status present, please add Rental Status!");
		}
		return ccList;
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
		data.setRentalStatusId(rentalStatusVO.getRentalStatusId());
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
		Optional<RentalStatus> cs =rentalStatusRepo.findById(rentalStatusId);
		if(!cs.isPresent()) {
			throw new NotFoundException("Rental Status Id : "+rentalStatusId+" does not exist!");
		}
		return cs.get();
	}

	@Override
	public RentalStatus deleteByRentalStatusId(Integer rentalStatusId) {
		RentalStatus delete = rentalStatusRepo.findByRentalStatusId(rentalStatusId);
		rentalStatusRepo.delete(delete);
		return delete;
	}

}
