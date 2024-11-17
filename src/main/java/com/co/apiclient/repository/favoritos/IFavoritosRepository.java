package com.co.apiclient.repository.favoritos;

import com.co.apiclient.domain.favorito.Favorito;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;


public interface IFavoritosRepository extends ReactiveCrudRepository<Favorito, String> {

    @Query("{'email':?0}")
    Flux<Favorito> findByEmail(String email);
}
