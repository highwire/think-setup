package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.repo.PublisherRepo;
import com.mps.think.setup.service.PublisherSerivce;
import com.mps.think.setup.vo.PublisherVO;

public class PublisherSerivceImpl implements PublisherSerivce {

	@Autowired 
	PublisherRepo publisherRepo;
	@Override
	public List<Publisher> findAllPublisher() {
		return publisherRepo.findAll();
	}

	@Override
	public PublisherVO savePublisher(PublisherVO publiser) {
		return null;
	}

	@Override
	public PublisherVO updatePublisher(PublisherVO publiser) {
		return null;
	}

	@Override
	public PublisherVO findbyPublisherId(Integer id) {
		return null;
	}

}
