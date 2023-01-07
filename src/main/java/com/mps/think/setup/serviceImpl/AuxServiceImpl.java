package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.AuxVariable;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.repo.AuxRepo;
import com.mps.think.setup.service.AuxService;
import com.mps.think.setup.vo.AuxVariableVO;
@Service
public class AuxServiceImpl implements AuxService {

	@Autowired
	AuxRepo auxRepo;

	@Override
	public List<AuxVariable> findAllAuxVariable() {
		return auxRepo.findAll();
	}

	@Override
	public AuxVariableVO saveAuxVariable(AuxVariableVO auxStatusVO) {
		AuxVariable auxVariable = new AuxVariable();
		Publisher publisher = new Publisher();
		publisher.setId(auxStatusVO.getPubId().getId());
		auxVariable.setPubId(publisher);
		auxVariable.setAuxCategory(auxStatusVO.getAuxCategory());
		auxVariable.setAuxStatus(auxStatusVO.getAuxStatus());
		auxVariable.setDefultValue(auxStatusVO.getDefultValue());
		auxVariable.setVariableName(auxStatusVO.getVariableName());
		auxVariable.setVariableType(auxStatusVO.getVariableType());
		auxVariable = auxRepo.save(auxVariable);
		auxStatusVO.setAuxVarId(auxVariable.getAuxVarId());
		return auxStatusVO;
	}

	@Override
	public AuxVariableVO updateAuxVariable(AuxVariableVO auxStatusVO) {
		AuxVariable auxVariable = new AuxVariable();
		auxVariable.setAuxVarId(auxStatusVO.getAuxVarId());
		Publisher publisher = new Publisher();
		publisher.setId(auxStatusVO.getPubId().getId());
		auxVariable.setPubId(publisher);
		auxVariable.setAuxCategory(auxStatusVO.getAuxCategory());
		auxVariable.setAuxStatus(auxStatusVO.getAuxStatus());
		auxVariable.setDefultValue(auxStatusVO.getDefultValue());
		auxVariable.setVariableName(auxStatusVO.getVariableName());
		auxVariable.setVariableType(auxStatusVO.getVariableType());
		auxVariable = auxRepo.save(auxVariable);
		return auxStatusVO;
	}

	@Override
	public AuxVariable findbyAuxId(Integer auxId) {
		return auxRepo.findById(auxId).get();
	}

	@Override
	public AuxVariable deleteByAuxVariableId(Integer auxId) {
		AuxVariable data=findbyAuxId(auxId);
		auxRepo.delete(data);
		return data;
	}

}
