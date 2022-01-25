package biz.seagull.mycrmsea.repository.impl;

import biz.seagull.mycrmsea.repository.AuthorityRepository;
import biz.seagull.mycrmsea.repository.spring.AuthorityRepositorySpring;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorityRepositoryImpl implements AuthorityRepository {

  private final AuthorityRepositorySpring delegateRep;

  public AuthorityRepositoryImpl(AuthorityRepositorySpring delegateRep) {
    this.delegateRep = delegateRep;
  }
}
