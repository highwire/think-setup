package com.mps.think.setup.service;

import java.util.List;


import com.mps.think.setup.model.Terms;
import com.mps.think.setup.vo.TermsVO;

public interface TermsService {
	
	public List<Terms> findAllTerms();

	public TermsVO saveTerms(TermsVO terms);

	public TermsVO updateTerms(TermsVO terms);

	public Terms findbytermsId(Integer termsId);
	
	public Terms deleteBytermsId(Integer termsId);

}
