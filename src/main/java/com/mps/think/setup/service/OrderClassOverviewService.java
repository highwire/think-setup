package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.OrderClassOverview;
import com.mps.think.setup.vo.OrderClassOverviewVO;

public interface OrderClassOverviewService {

	public OrderClassOverviewVO saveOrderClassOverview(OrderClassOverviewVO overview);
	
	public OrderClassOverviewVO updateOrderClassOverview(OrderClassOverviewVO overview);
	
	public List<OrderClassOverview> getAllOrderClassOverviewByParentId(Integer parentId);
	
	public OrderClassOverview deleteOrderClassOverviewById(Integer id);
	
	public OrderClassOverview findOrderClassOverviewById(Integer id);
	
	public List<OrderClassOverview> getAllOrderClassOverviewByPubId(Integer pubId);
	
}
