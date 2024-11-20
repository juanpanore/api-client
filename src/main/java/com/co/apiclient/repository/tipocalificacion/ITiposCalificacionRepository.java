package com.co.apiclient.repository.tipocalificacion;

import com.co.apiclient.domain.tiposcalificacion.TiposCalificacion;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ITiposCalificacionRepository extends ReactiveCrudRepository<TiposCalificacion,String> {

    @Query("{'tipoCalificacion':?0}")
    Flux<TiposCalificacion> findByTipoCalificacion(String tipoCalificacion);

}
