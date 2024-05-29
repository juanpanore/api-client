package com.co.apiclient.repository.employer;


import com.co.apiclient.domain.employer.Employer;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

import java.util.List;

public interface IEmployerRepository extends ReactiveCrudRepository<Employer, String> {

    @Query("{ 'email': { $in: ?0 } } ")
    Flux<Employer> findByEmails(List<String> emails);

}
