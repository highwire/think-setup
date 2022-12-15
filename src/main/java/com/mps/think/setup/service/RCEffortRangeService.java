package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.RCEffortRange;
import com.mps.think.setup.vo.RCEffortRangeVO;

public interface RCEffortRangeService {

	public List<RCEffortRange> findAllRCEffortRange();

	public RCEffortRangeVO saveRCEffortRange(RCEffortRangeVO effortRangeVO);

	public RCEffortRangeVO updateRCEffortRange(RCEffortRangeVO effortRangeVO);
	
	public RCEffortRange deleteRCEffortRange(Integer rcEffortRangeId);

	public RCEffortRange findbyRCEffortRangeId(Integer rcEffortRangeId);
}
