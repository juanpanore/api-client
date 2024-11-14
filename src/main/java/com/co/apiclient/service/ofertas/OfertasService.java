package com.co.apiclient.service.ofertas;

import com.co.apiclient.domain.oferta.Oferta;

import com.co.apiclient.repository.ofertas.IOfertasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class OfertasService {

    @Autowired
    private IOfertasRepository iOfertasRepository;

    public Flux<Oferta> getAll() {
        return iOfertasRepository.findAll();
    }

    public Mono<Oferta> get(Integer id) {
        return iOfertasRepository.findById(id);
    }
}

