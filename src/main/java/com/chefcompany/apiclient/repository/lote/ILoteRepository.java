package com.chefcompany.apiclient.repository.lote;

import com.chefcompany.apiclient.domain.client.Lote;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

import java.util.Date;

public interface ILoteRepository extends ReactiveCrudRepository<Lote,Integer> {
    @Query("{'idLote':?0")
    Mono<Lote> findById(int idLote);

}
