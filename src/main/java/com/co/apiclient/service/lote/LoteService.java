package com.co.apiclient.service.lote;

import com.co.apiclient.domain.lote.Lote;
import com.co.apiclient.repository.lote.ILoteRepository;
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

    public Mono<Lote> save( Lote lote ) {
        lote.setFechaIngreso(new Date());
        return iLoteRepository.save(lote);
    }
}
