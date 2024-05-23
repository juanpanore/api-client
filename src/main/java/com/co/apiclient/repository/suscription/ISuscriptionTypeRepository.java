package com.co.apiclient.repository.suscription;

import com.co.apiclient.domain.suscription.SuscriptionType;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface ISuscriptionTypeRepository extends ReactiveCrudRepository<SuscriptionType, String> {
    @Query("{'idSuscription':?0}")
    Mono<SuscriptionType> findById(Integer idSuscription);
}
