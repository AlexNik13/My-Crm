package biz.seagull.mycrmsea.repository.impl;

import biz.seagull.mycrmsea.model.lead.Lead;
import biz.seagull.mycrmsea.repository.LeadRepository;
import biz.seagull.mycrmsea.repository.spring.LeadRepositorySpring;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public class LeadRepositoryImpl implements LeadRepository {

    private final LeadRepositorySpring delegateRep;

    public LeadRepositoryImpl(LeadRepositorySpring delegateRep) {
        this.delegateRep = delegateRep;
    }

    @Override
    public Lead save(Lead lead) {
        lead = delegateRep.save(lead);
        return lead;
    }

    @Override
    public Page<Lead> findAll(Pageable page) {
        return delegateRep.findAll(page);
    }

    @Override
    public Lead findById(Long leadId) {
        Lead lead = delegateRep.findById(leadId).orElseThrow(

        );
        return null;
    }

}
