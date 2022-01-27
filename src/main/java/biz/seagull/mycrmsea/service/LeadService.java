package biz.seagull.mycrmsea.service;

import biz.seagull.mycrmsea.dto.lead.LeadRequestDto;
import biz.seagull.mycrmsea.model.lead.Lead;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LeadService {
    Lead createLead(LeadRequestDto dto);


  Page<Lead> getAllLead(Pageable page);

  Lead getLead(Long leadId);
}
