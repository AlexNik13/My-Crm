package biz.seagull.mycrmsea.service.impl;

import biz.seagull.mycrmsea.dto.lead.LeadRequestDto;
import biz.seagull.mycrmsea.model.lead.Lead;
import biz.seagull.mycrmsea.model.lead.LeadStatus;
import biz.seagull.mycrmsea.repository.LeadRepository;
import biz.seagull.mycrmsea.service.LeadService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class LeadServiceImpl implements LeadService {

  private final LeadRepository leadRepository;

  private final Clock clock;

  public LeadServiceImpl(LeadRepository leadRepository, Clock clock) {
    this.leadRepository = leadRepository;
    this.clock = clock;
  }

  @Override
  public Lead createLead(LeadRequestDto dto) {
    Lead lead = new Lead();

    lead.setLeadName(dto.getLeadName());
    lead.setName(dto.getName());
    lead.setPhoneNumber(dto.getPhoneNumber());
    lead.setCity(dto.getCity());
    lead.setCommentClient(dto.getCommentClient());
    lead.setLeadStatus(LeadStatus.ACTIVE);
    lead.setDataRegistration(LocalDateTime.now(clock));

    lead = leadRepository.save(lead);
    return lead;
  }

  @Override
  public Page<Lead> getAllLead(Pageable page) {
    Page<Lead> leadPage = leadRepository.findAll(page);
    return leadPage;
  }


}
