package com.co.apiclient.repository.ofertas;

import com.co.apiclient.domain.oferta.Oferta;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface IOfertasRepository extends ReactiveCrudRepository<Oferta, String> {

    @Query("{'idProducto':?0}")
    Mono<Oferta> findById(Integer idProducto);
}
