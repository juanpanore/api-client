package com.co.apiclient.repository.tyc;

import com.co.apiclient.domain.tyc.TyC;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ITyCRepository extends ReactiveCrudRepository<TyC,String> {

    @Query("{'tipoUsuario':?0}")
    Flux<TyC> findByTipoUsuario(String tipoUsuario);
}
