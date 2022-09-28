package com.dilibraryapp.apibook.controllers.lote;


import com.chefcompany.apiclient.domain.lote.Lote;
import com.dilibraryapp.apibook.service.lote.LoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/rest")
public class LoteController {

    @Autowired
    private LoteService loteService;

    @GetMapping("/lote")
    public Mono<Lote> get(@RequestParam(required = true) int idLote) {

        return loteService.get(idLote);
    }

    @PostMapping("/lote")
    public Mono<Lote> create( @Valid @RequestBody Lote lote) {
        return loteService.save(lote);

    }

}
