package com.co.apiclient.controllers.tyc;

import com.co.apiclient.domain.tyc.TyC;
import com.co.apiclient.service.tyc.TyCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/v1/rest")
public class TyCController {

    @Autowired
    private TyCService tyCService;

    @GetMapping("/tyc/{tipoUsuario}")
    public Flux<TyC> get(@PathVariable String tipoUsuario) {

        return tyCService.getByTipoUsuario(tipoUsuario);
    }
}
