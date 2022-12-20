package com.mps.think.setup.service;

import java.util.List;


import com.mps.think.setup.model.SourceCode;

import com.mps.think.setup.vo.SourceCodeVO;

public interface SourceCodeService {
	
	public List<SourceCode> findAllSourceCode();

	public SourceCodeVO saveSourceCode(SourceCodeVO sourceCode);

	public SourceCodeVO updateSourceCode(SourceCodeVO sourceCodeId);
	
	public SourceCode deleteSourceCodeById(Integer sourceCodeId);

	public SourceCode findbySourceCodeId(Integer sourceCodeId);

}
