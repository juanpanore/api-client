package com.co.apiclient.service.favorito;

import com.co.apiclient.domain.favorito.Favorito;
import com.co.apiclient.domain.oferta.Oferta;
import com.co.apiclient.repository.favoritos.IFavoritosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class FavoritosService {

    @Autowired
    private IFavoritosRepository iFavoritosRepository;

    public Flux<Favorito> getByEmail(String email) {
        return iFavoritosRepository.findByEmail(email);
    }

}
