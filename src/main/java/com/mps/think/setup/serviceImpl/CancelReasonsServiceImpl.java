package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import com.mps.think.setup.model.CancelReasons;
import com.mps.think.setup.model.CustomerCategory;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.repo.CancelReasonsRepo;
import com.mps.think.setup.repo.CustomerCategoryRepo;
import com.mps.think.setup.service.CancelReasonsService;
import com.mps.think.setup.vo.CancelReasonsVO;
@Service
public class CancelReasonsServiceImpl implements CancelReasonsService{
	
	@Autowired
	CancelReasonsRepo CancelReasonsRepo;

	@Override
	public List<CancelReasons> findAllCancelReasons() {
		List<CancelReasons> crList = CancelReasonsRepo.findAll();
		if (crList.isEmpty()) {
			throw new NotFoundException("No Cancel Reasons present, please add Cancel Reason!");
		}
		return crList;
	}

	
	@Override
	public CancelReasonsVO saveCancelReasons(CancelReasonsVO cancelReasons) {
		CancelReasons data  = new CancelReasons();
		data.setCancelReason(cancelReasons.getCancelReason());
		data.setDescription(cancelReasons.getDescription());
		cancelReasons.setCancelReasonsId(data.getCancelReasonsId());
		data.setOrdClasses(cancelReasons.getOrdClasses());
		Publisher publisher=new Publisher();
		publisher.setId(cancelReasons.getPubId().getId());
		data.setPubId(publisher);
		CancelReasonsRepo.saveAndFlush(data);
		
		return cancelReasons;
		
	}	
		
	@Override
	public CancelReasonsVO updateCancelReasons(CancelReasonsVO cancelReasons) {
		CancelReasons data  = new CancelReasons();
		data.setCancelReasonsId(cancelReasons.getCancelReasonsId());
		Publisher publisher=new Publisher();
		publisher.setId(cancelReasons.getPubId().getId());
		data.setPubId(publisher);
		data.setCancelReason(cancelReasons.getCancelReason());
		data.setDescription(cancelReasons.getDescription());
		data.setOrdClasses(cancelReasons.getOrdClasses());
		CancelReasonsRepo.saveAndFlush(data);
		return cancelReasons;
	}

	@Override
	public CancelReasons findbyCancelReasonsId(Integer cancelReasonsId) {
       Optional<CancelReasons> cr = CancelReasonsRepo.findById(cancelReasonsId);
		if(!cr.isPresent()) {
			throw new NotFoundException("Cancel Reason Id : "+ cancelReasonsId +" does not exist!");
		}
		return cr.get();
	}	
}
