package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.AuxVariable;
import com.mps.think.setup.model.CustomerCategory;
import com.mps.think.setup.vo.AuxVariableVO;

public interface AuxService {

	public List<AuxVariable> findAllAuxVariable();

	public AuxVariableVO saveAuxVariable(AuxVariableVO auxStatus);

	public AuxVariableVO updateAuxVariable(AuxVariableVO auxStatus);

	public AuxVariable findbyAuxId(Integer auxId);
	
	public AuxVariable deleteByAuxVariableId(Integer auxId);

}
