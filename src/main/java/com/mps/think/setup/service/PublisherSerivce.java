package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.vo.PublisherVO;

public interface PublisherSerivce {

	public List<Publisher> findAllPublisher();

	public PublisherVO savePublisher(PublisherVO publiser);

	public PublisherVO updatePublisher(PublisherVO publiser);

	public Publisher findbyPublisherId(Integer id);

}
