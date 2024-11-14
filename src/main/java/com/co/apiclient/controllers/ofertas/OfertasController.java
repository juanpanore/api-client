package com.co.apiclient.controllers.ofertas;

import com.co.apiclient.domain.oferta.Oferta;
import com.co.apiclient.service.ofertas.OfertasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/rest")
public class OfertasController {
    @Autowired
    private OfertasService ofertasService;

    @GetMapping("/ofertas")
    public Flux<Oferta> getAll() {

        return ofertasService.getAll();
    }

    @GetMapping("/ofertas/{idOferta}")
    public Mono<Oferta> get(@PathVariable Integer idOferta) {

        return ofertasService.get(idOferta);
    }
}
