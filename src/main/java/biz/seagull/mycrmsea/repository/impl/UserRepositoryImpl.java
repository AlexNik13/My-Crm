package biz.seagull.mycrmsea.repository.impl;

import biz.seagull.mycrmsea.repository.UserRepository;
import biz.seagull.mycrmsea.repository.spring.UserRepositorySpring;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

  private final UserRepositorySpring delegateRep;

  public UserRepositoryImpl(UserRepositorySpring delegateRep) {
    this.delegateRep = delegateRep;
  }
}
