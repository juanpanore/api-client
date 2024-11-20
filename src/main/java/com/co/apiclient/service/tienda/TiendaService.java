package com.co.apiclient.service.tienda;

import com.co.apiclient.domain.tienda.Tienda;
import com.co.apiclient.repository.tienda.ITiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;

@Service
public class TiendaService {

    @Autowired
    private ITiendaRepository iTiendaRepository;

    public Mono<Tienda> getByIdTienda(String idTienda) {
        return iTiendaRepository.findByIdTienda(idTienda);
    }

}
