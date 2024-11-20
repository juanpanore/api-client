package com.co.apiclient.repository.tienda;

import com.co.apiclient.domain.favorito.Favorito;
import com.co.apiclient.domain.tienda.Tienda;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ITiendaRepository extends ReactiveCrudRepository<Tienda, String> {

    @Query("{'idTienda':?0}")
    Mono<Tienda> findByIdTienda(String idTienda);
}
