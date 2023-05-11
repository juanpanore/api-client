package com.co.apiclient.service.firma;

import com.co.apiclient.domain.firma.Firma;
import com.co.apiclient.repository.firma.IFirmasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class FirmaService {

    @Autowired
    private IFirmasRepository ifirmasRepository;
    public Mono<Firma> get(String correoUsuario){
        return  ifirmasRepository.findByCorreoUsuario(correoUsuario);
    }

}
