package com.co.apiclient.controllers.favoritos;

import com.co.apiclient.domain.favorito.Favorito;
import com.co.apiclient.domain.track.Track;
import com.co.apiclient.service.favorito.FavoritosService;
import com.co.apiclient.service.track.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/v1/rest")
public class FavoritosController {

    @Autowired
    private FavoritosService favoritosService;

    @GetMapping("/favoritos/{email}")
    public Flux<Favorito> get(@PathVariable String email) {

        return favoritosService.getByEmail(email);
    }
}
