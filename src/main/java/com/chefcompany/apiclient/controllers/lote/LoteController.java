package com.chefcompany.apiclient.controllers.lote;


import com.chefcompany.apiclient.domain.client.Lote;
import com.chefcompany.apiclient.service.lote.LoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Date;

@RestController
@RequestMapping("/api/v1/rest")
public class LoteController {

    @Autowired
    private LoteService loteService;

    @GetMapping("/lote")
    public Mono<Lote> get(@RequestParam(required = true) int idLote) {

        return loteService.get(idLote);
    }

}
