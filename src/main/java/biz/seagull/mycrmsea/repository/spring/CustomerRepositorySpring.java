package biz.seagull.mycrmsea.repository.spring;

import biz.seagull.mycrmsea.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepositorySpring extends PagingAndSortingRepository<Customer, Long> {
}
