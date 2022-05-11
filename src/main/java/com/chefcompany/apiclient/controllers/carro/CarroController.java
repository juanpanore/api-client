package com.chefcompany.apiclient.controllers.carro;

import com.chefcompany.apiclient.domain.carro.Carro;
import com.chefcompany.apiclient.service.carro.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/rest")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @GetMapping("/carros")
    public Flux<Carro> get() {

        return carroService.get();
    }

    @PostMapping("/carros")
    public Mono<Carro> create(@Valid @RequestBody Carro carro) {
        return carroService.save(carro);
    }

    @DeleteMapping("/carros")
    public Mono<ResponseEntity<Void>> delete (@RequestParam(required = true) String idCarro){

        return carroService.delete(idCarro).then(Mono.just(new ResponseEntity<Void>(HttpStatus.OK)))
                .defaultIfEmpty(new ResponseEntity<Void>(HttpStatus.NOT_FOUND));

    }
}
