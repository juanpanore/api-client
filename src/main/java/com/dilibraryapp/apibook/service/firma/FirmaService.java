package com.dilibraryapp.apibook.service.firma;

import com.chefcompany.apiclient.domain.firma.Firma;
import com.dilibraryapp.apibook.repository.firma.IFirmasRepository;
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
