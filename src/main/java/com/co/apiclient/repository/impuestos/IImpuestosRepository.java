package com.co.apiclient.repository.impuestos;

import com.co.apiclient.domain.impuestos.Impuesto;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface IImpuestosRepository extends ReactiveCrudRepository<Impuesto, String> {
    @Query("{'nombreImpuesto':?0}")
    Mono<Impuesto> findByNombreImpuesto(String nombreImpuesto);
}
