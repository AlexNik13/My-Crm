package biz.seagull.mycrmsea.repository.spring;

import biz.seagull.mycrmsea.model.user.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepositorySpring extends JpaRepository<Authority, Long> {
}
