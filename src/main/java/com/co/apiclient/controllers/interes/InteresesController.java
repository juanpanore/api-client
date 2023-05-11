package com.co.apiclient.controllers.interes;

import com.co.apiclient.domain.interes.Interes;
import com.co.apiclient.service.interes.InteresesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/rest")
public class InteresesController {


    @Autowired
    private InteresesService interesesService;

    @GetMapping("/intereses")
    public Flux<Interes> get(@RequestParam(required = true)  String[] categorias ) {

        return interesesService.get(categorias);
    }

    @GetMapping("/intereses/all")
    public Flux<Interes> get() {

        return interesesService.getAll();
    }

}
