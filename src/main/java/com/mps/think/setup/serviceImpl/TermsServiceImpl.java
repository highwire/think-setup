package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.model.Terms;
import com.mps.think.setup.repo.TermsRepo;
import com.mps.think.setup.service.TermsService;
import com.mps.think.setup.vo.TermsVO;

@Service
public class TermsServiceImpl implements TermsService{
	
	@Autowired
	TermsRepo termsRepo;

	@Override
	public List<Terms> findAllTerms() {
		List<Terms> tList = termsRepo.findAll();
		if (tList.isEmpty()) {
			throw new NotFoundException("No Terms present, please add Terms!");
		}
		return tList;
	}

//	@Override
//	public TermsVO saveTerms(TermsVO terms) {
//		Terms data  = new Terms();
//		data.setTerm(terms.getTerm());
//		data.setDescription(terms.getDescription());
//		data.setSegmented(terms.getSegmented());
//		data.setSegment(terms.getSegment());
//		data.setUnitsPerSegment(terms.getUnitsPerSegment());
//		data.setQuantity(terms.getQuantity());
//		data.setDuration(terms.getDuration());
//		data.setUnitsInDuration(terms.getUnitsInDuration());
//		data.setVolumeGroupsToSpan(terms.getVolumeGroupsToSpan());
//		data.setStartType(terms.getStartType());
//		data.setInstallmentterm(terms.getInstallmentterm());
//		terms.setTermsId(terms.getTermsId());
//		Publisher publisher=new Publisher();
//		publisher.setId(terms.getPubId().getId());
//		data.setPubId(publisher);
//		termsRepo.saveAndFlush(data);
//		return terms;
//	}
	@Override
	public TermsVO saveTerms(TermsVO terms) {
		Terms data  = new Terms();
		
		if (terms.getSegmented()== true ) {
			data.setTerm(terms.getTerm());
			data.setDescription(terms.getDescription());
			data.setSegmented(terms.getSegmented());
			data.setSegment(terms.getSegment());
			data.setUnitsPerSegment(terms.getUnitsPerSegment());
			data.setQuantity(terms.getSegment() * terms.getUnitsPerSegment());
			data.setDuration(terms.getDuration());
			data.setUnitsInDuration(terms.getUnitsInDuration());
			data.setVolumeGroupsToSpan(terms.getVolumeGroupsToSpan());
			data.setStartType(terms.getStartType());
			data.setInstallmentterm(terms.getInstallmentterm());
			terms.setTermsId(terms.getTermsId());
			Publisher publisher=new Publisher();
			publisher.setId(terms.getPubId().getId());
			data.setPubId(publisher);
			termsRepo.saveAndFlush(data);
		}
		else {
			data.setTerm(terms.getTerm());
			data.setDescription(terms.getDescription());
			data.setQuantity(terms.getQuantity());
			data.setDuration(terms.getDuration());
			data.setUnitsInDuration(terms.getUnitsInDuration());
			data.setVolumeGroupsToSpan(terms.getVolumeGroupsToSpan());
			data.setStartType(terms.getStartType());
			data.setInstallmentterm(terms.getInstallmentterm());
			data.setSegmented(terms.getSegmented());
			Publisher publisher=new Publisher();
			publisher.setId(terms.getPubId().getId());
			data.setPubId(publisher);
			termsRepo.saveAndFlush(data);
		}
		return terms;}

//	@Override
//	public TermsVO updateTerms(TermsVO terms) {
//		Terms data  = new Terms();
//		data.setTermsId(terms.getTermsId());
//		Publisher publisher=new Publisher();
//		publisher.setId(terms.getPubId().getId());
//		data.setPubId(publisher);
//		data.setTerm(terms.getTerm());
//		data.setDescription(terms.getDescription());
//		data.setSegmented(terms.getSegmented());
//		data.setSegment(terms.getSegment());
//		data.setUnitsPerSegment(terms.getUnitsPerSegment());
//		data.setQuantity(terms.getQuantity());
//		data.setDuration(terms.getDuration());
//		data.setUnitsInDuration(terms.getUnitsInDuration());
//		data.setVolumeGroupsToSpan(terms.getVolumeGroupsToSpan());
//		data.setStartType(terms.getStartType());
//		data.setInstallmentterm(terms.getInstallmentterm());
//		termsRepo.saveAndFlush(data);
//		return terms;
//	}
	@Override
	public TermsVO updateTerms(TermsVO terms) {
		Terms data  = new Terms();
		if(terms.getSegmented()==true) {
			data.setTermsId(terms.getTermsId());
			Publisher publisher=new Publisher();
			publisher.setId(terms.getPubId().getId());
			data.setPubId(publisher);
			data.setTerm(terms.getTerm());
			data.setDescription(terms.getDescription());
			data.setSegmented(terms.getSegmented());
			data.setSegment(terms.getSegment());
			data.setUnitsPerSegment(terms.getUnitsPerSegment());
			data.setQuantity(terms.getSegment() * terms.getUnitsPerSegment());
			data.setDuration(terms.getDuration());
			data.setUnitsInDuration(terms.getUnitsInDuration());
			data.setVolumeGroupsToSpan(terms.getVolumeGroupsToSpan());
			data.setStartType(terms.getStartType());
			data.setInstallmentterm(terms.getInstallmentterm());
			termsRepo.saveAndFlush(data);
			}
		else {
				data.setTermsId(terms.getTermsId());
				Publisher publisher=new Publisher();
				publisher.setId(terms.getPubId().getId());
				data.setPubId(publisher);
				data.setTerm(terms.getTerm());
				data.setDescription(terms.getDescription());
				data.setQuantity(terms.getQuantity());
				data.setDuration(terms.getDuration());
				data.setUnitsInDuration(terms.getUnitsInDuration());
				data.setVolumeGroupsToSpan(terms.getVolumeGroupsToSpan());
				data.setStartType(terms.getStartType());
				data.setInstallmentterm(terms.getInstallmentterm());
				termsRepo.saveAndFlush(data);
			}
		return terms;}
	

	@Override
	public Terms findbytermsId(Integer termsId) {
		 Optional<Terms> cr = termsRepo.findById(termsId);
			if(!cr.isPresent()) {
				throw new NotFoundException("Terms  Id : "+ termsId +" does not exist!");
			}
			return cr.get();
	}

}
