package com.co.apiclient.controllers.tienda;

import com.co.apiclient.domain.tienda.Tienda;
import com.co.apiclient.service.tienda.TiendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/rest")
public class TiendaController {

    @Autowired
    private TiendaService tiendaService;
    @GetMapping("/tienda/{idTienda}")
    public Mono<Tienda> get(@PathVariable String idTienda) {

        return tiendaService.getByIdTienda(idTienda);
    }

}
