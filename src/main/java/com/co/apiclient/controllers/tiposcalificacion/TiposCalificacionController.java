package com.co.apiclient.controllers.tiposcalificacion;


import com.co.apiclient.domain.tiposcalificacion.TiposCalificacion;
import com.co.apiclient.service.tiposcalificacion.TiposCalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/v1/rest")
public class TiposCalificacionController {

    @Autowired
    private TiposCalificacionService tipoCalificacionService;

    @GetMapping("/tiposcalificacion/{tipoCalificacion}")
    public Flux<TiposCalificacion> get(@PathVariable String tipoCalificacion) {

        return tipoCalificacionService.getByTipoCalificacion(tipoCalificacion);
    }
}
