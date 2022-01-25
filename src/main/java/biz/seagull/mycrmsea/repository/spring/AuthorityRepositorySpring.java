package biz.seagull.mycrmsea.repository.spring;

import biz.seagull.mycrmsea.model.user.Authority;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepositorySpring extends PagingAndSortingRepository<Authority, Long> {
}
