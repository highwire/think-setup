package com.mps.think.setup.service;

import java.util.List;


import com.mps.think.setup.model.CommodityCodes;
import com.mps.think.setup.vo.CommodityCodesVO;

public interface CommodityCodesService {
	
	public List<CommodityCodes> findAllCommodityCodes();

	public CommodityCodesVO saveCommodityCodes(CommodityCodesVO commodityCodes);

	public CommodityCodesVO updateCommodityCodes(CommodityCodesVO commodityCodes);

	public CommodityCodes findbyId(Integer id);
	
	public CommodityCodes deleteCommodityCodesById(Integer id);

}
