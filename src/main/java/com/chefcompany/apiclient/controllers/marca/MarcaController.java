package com.chefcompany.apiclient.controllers.marca;

import com.chefcompany.apiclient.domain.marca.Marca;
import com.chefcompany.apiclient.service.marca.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
@RestController
@RequestMapping("/marca")
public class MarcaController {

    @Autowired
    private MarcaService marcaService;

    @GetMapping("/listar")
    public Flux<Marca> get() {

        return marcaService.get();
    }

    @PostMapping("/crear")
    public Mono<Marca> create(@Valid @RequestBody Marca marca) {
        return marcaService.save(marca);
    }

    @DeleteMapping("/borrar")
    public Mono<ResponseEntity<Void>> delete (@RequestParam(required = true) String idMarca){

        return marcaService.delete(idMarca).then(Mono.just(new ResponseEntity<Void>(HttpStatus.OK)))
                .defaultIfEmpty(new ResponseEntity<Void>(HttpStatus.NOT_FOUND));


    }
}