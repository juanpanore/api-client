package com.co.apiclient.controllers.firmas;


import com.co.apiclient.domain.firma.Firma;
import com.co.apiclient.service.firma.FirmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("api/v1/rest")


public class FirmaController {

        @Autowired
        private FirmaService firmaService;

        @GetMapping("/firmas")
        public Mono<Firma> get(@RequestParam(required = true) String correoUsuario){

            return firmaService.get(correoUsuario);
        }


}
