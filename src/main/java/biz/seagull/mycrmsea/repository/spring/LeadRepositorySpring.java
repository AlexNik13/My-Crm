package biz.seagull.mycrmsea.repository.spring;

import biz.seagull.mycrmsea.model.lead.Lead;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeadRepositorySpring extends PagingAndSortingRepository<Lead, Long> {
}
