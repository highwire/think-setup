package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.CancelReasons;
import com.mps.think.setup.vo.CancelReasonsVO;


public interface CancelReasonsService {
	
	public List<CancelReasons> findAllCancelReasons();

	public CancelReasonsVO saveCancelReasons(CancelReasonsVO cancelReasons);

	public CancelReasonsVO updateCancelReasons(CancelReasonsVO cancelReasons);

	public CancelReasons findbyCancelReasonsId(Integer cancelReasonsId);

}
