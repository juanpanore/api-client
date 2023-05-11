package com.co.apiclient.service.marca;

import com.co.apiclient.domain.marca.Marca;
import com.co.apiclient.repository.marca.IMarcaRepository;
import com.co.apiclient.util.Constants;
import com.co.apiclient.util.UtilStrings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MarcaService {

    @Autowired
    private IMarcaRepository iMarcaRepository;

    public Flux<Marca> get() {
        return iMarcaRepository.findAll();
    }

    public Mono<Marca> save(Marca marca) {
        validationData(marca);
        return iMarcaRepository.save(marca);
    }

    public Mono<Void> delete(String idMarca) {
        return iMarcaRepository.findById(idMarca).flatMap(existingMarca -> iMarcaRepository.deleteById(idMarca));
    }


    private void validationData(Marca marca) {

        UtilStrings.requieresNoNullOrNoEmpty(marca.getIdImagen(), String.format(Constants.TXT_EXPECT_VALUE, marca.getIdImagen()));
        UtilStrings.requieresNoNullOrNoEmpty(marca.getDescripcion(),String.format(Constants.TXT_EXPECT_VALUE, marca.getDescripcion()));
        UtilStrings.requieresNoNullOrNoEmpty(marca.getNombre(),String.format(Constants.TXT_EXPECT_VALUE, marca.getNombre()));

    }
}
