package com.mps.think.setup.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.OrderClassOverview;

@Repository
public interface OrderClassOverviewRepo extends JpaRepository<OrderClassOverview, Integer> {

	public List<OrderClassOverview> findByParentId(Integer parentId);
	
	public List<OrderClassOverview> findByPublisherId(Integer id);
	
}
