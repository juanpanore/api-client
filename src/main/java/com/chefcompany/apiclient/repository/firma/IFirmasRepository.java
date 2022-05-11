package com.chefcompany.apiclient.repository.firma;

import com.chefcompany.apiclient.domain.firma.Firma;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface IFirmasRepository extends ReactiveCrudRepository<Firma,String> {

    @Query("{'correoUsuario':?0}")
    Mono<Firma> findByCorreoUsuario(String correoUsuario);

}
