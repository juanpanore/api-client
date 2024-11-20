package com.co.apiclient.service.tiposcalificacion;

import com.co.apiclient.domain.tiposcalificacion.TiposCalificacion;
import com.co.apiclient.repository.tipocalificacion.ITiposCalificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class TiposCalificacionService {
    @Autowired
    private ITiposCalificacionRepository iTiposCalificacionRepository;

    public Flux<TiposCalificacion> getByTipoCalificacion(String tipoCalificacion) {
        return iTiposCalificacionRepository.findByTipoCalificacion(tipoCalificacion);
    }


}
