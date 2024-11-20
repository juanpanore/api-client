package com.co.apiclient.service.tyc;

import com.co.apiclient.domain.tyc.TyC;
import com.co.apiclient.repository.tyc.ITyCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class TyCService {
    @Autowired
    private ITyCRepository iTyCRepository;

    public Flux<TyC> getByTipoUsuario(String tipoUsuario) {
        return iTyCRepository.findByTipoUsuario(tipoUsuario);
    }

}
