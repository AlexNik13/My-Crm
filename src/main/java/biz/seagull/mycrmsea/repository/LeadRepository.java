package biz.seagull.mycrmsea.repository;

import biz.seagull.mycrmsea.model.lead.Lead;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LeadRepository {
  Lead save(Lead lead);

  Page<Lead> findAll(Pageable page);

  Lead findById(Long leadId);
}
