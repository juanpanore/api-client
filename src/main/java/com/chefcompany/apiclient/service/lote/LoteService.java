package com.chefcompany.apiclient.service.lote;

import com.chefcompany.apiclient.domain.client.Lote;
import com.chefcompany.apiclient.repository.lote.ILoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Date;

@Service
public class LoteService {

    @Autowired
    private ILoteRepository iLoteRepository;

    public Mono<Lote> get (int idLote){

       return iLoteRepository.findById(idLote);
    }
}
