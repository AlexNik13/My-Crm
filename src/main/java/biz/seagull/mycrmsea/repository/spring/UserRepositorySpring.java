package biz.seagull.mycrmsea.repository.spring;

import biz.seagull.mycrmsea.model.user.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepositorySpring extends PagingAndSortingRepository<User, Long> {
}
