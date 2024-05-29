package com.co.apiclient.repository.reduser;

import com.co.apiclient.domain.reduser.UserType;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IUserTypeRepository extends ReactiveCrudRepository<UserType, String> {
}
