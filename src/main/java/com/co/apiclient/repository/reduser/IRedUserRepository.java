package com.co.apiclient.repository.reduser;

import com.co.apiclient.domain.reduser.RedUser;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface IRedUserRepository extends ReactiveCrudRepository<RedUser, String> {

    @Query("{ 'username': ?0 }")
    Mono<RedUser> findByUsername(String username);
}
