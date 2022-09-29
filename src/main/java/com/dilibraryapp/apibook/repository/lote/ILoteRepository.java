package com.dilibraryapp.apibook.repository.lote;

import com.chefcompany.apiclient.domain.lote.Lote;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface ILoteRepository extends ReactiveCrudRepository<Lote,Integer> {
    @Query("{'idLote':?0}")
    Mono<Lote> findById(int idLote);

}
