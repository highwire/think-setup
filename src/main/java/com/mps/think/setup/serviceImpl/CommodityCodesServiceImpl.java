package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import com.mps.think.setup.model.CancelReasons;
import com.mps.think.setup.model.CommodityCodes;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.repo.CommodityCodesRepo;
import com.mps.think.setup.service.CommodityCodesService;
import com.mps.think.setup.vo.CommodityCodesVO;

@Service
public class CommodityCodesServiceImpl implements CommodityCodesService {
	
	@Autowired
    CommodityCodesRepo commodityCodesRepo;

	@Override
	public List<CommodityCodes> findAllCommodityCodes() {
		List<CommodityCodes> ccList = commodityCodesRepo.findAll();
		if (ccList.isEmpty()) {
			throw new NotFoundException("No Commodity Codes present, please add Commodity Codes!");
		}
		return ccList;
	}

	@Override
	public CommodityCodesVO saveCommodityCodes(CommodityCodesVO commodityCodes) {
		CommodityCodes data = new CommodityCodes();
		data.setCommodityCode(commodityCodes.getCommodityCode());
		data.setDescription(commodityCodes.getDescription());
		commodityCodes.setId(data.getId());
		Publisher publisher=new Publisher();
		publisher.setId(commodityCodes.getPubId().getId());
		data.setPubId(publisher);
		commodityCodesRepo.saveAndFlush(data);
		return commodityCodes;
	}

	@Override
	public CommodityCodesVO updateCommodityCodes(CommodityCodesVO commodityCodes) {
		CommodityCodes data = new CommodityCodes();
		data.setId(commodityCodes.getId());
		Publisher publisher=new Publisher();
		publisher.setId(commodityCodes.getPubId().getId());
		data.setPubId(publisher);
		data.setCommodityCode(commodityCodes.getCommodityCode());
		data.setDescription(commodityCodes.getDescription());
		commodityCodesRepo.saveAndFlush(data);
		return commodityCodes;
	}

	@Override
	public CommodityCodes findbyId(Integer id) {
		 Optional<CommodityCodes> cc = commodityCodesRepo.findById(id);
			if(!cc.isPresent()) {
				throw new NotFoundException("Commodity Codes Id : "+ id +" does not exist!");
			}
			return cc.get();
	}

	

//	@Override
//	public CommodityCodes deleteById(Integer Id) {
//		CommodityCodes delete = commodityCodesRepo.findById(Id);
//		commodityCodesRepo.delete(delete);
//		return delete;
//	}
	@Override
	public CommodityCodes deleteCommodityCodesById(Integer id) {
		CommodityCodes todelete = commodityCodesRepo.findCommodityCodesById(id);
		commodityCodesRepo.delete(todelete);
		return todelete;
	}

}
