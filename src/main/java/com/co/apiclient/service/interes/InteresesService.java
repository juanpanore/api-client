package com.co.apiclient.service.interes;


import com.co.apiclient.domain.interes.Interes;
import com.co.apiclient.repository.Interes.IInteresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;


@Service
public class InteresesService {
    @Autowired
    private IInteresRepository iInteresRepository;

    public Flux<Interes> getAll() {
        return iInteresRepository.findAll();
    }
    public Flux<Interes> get(String[] categorias) {
        return iInteresRepository.findByCategoria(categorias);
    }
}
