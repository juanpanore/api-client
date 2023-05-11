package com.co.apiclient.repository.Interes;

import com.co.apiclient.domain.carro.Carro;
import com.co.apiclient.domain.client.Client;
import com.co.apiclient.domain.interes.Interes;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IInteresRepository extends ReactiveCrudRepository<Interes, String> {

    @Query("{ 'categoria': { $in: ?0 }}")
    Flux<Interes> findByCategoria(String[]  documentNumber);
}
