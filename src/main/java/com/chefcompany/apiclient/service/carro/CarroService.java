package com.chefcompany.apiclient.service.carro;

import com.chefcompany.apiclient.domain.carro.Carro;
import com.chefcompany.apiclient.domain.marca.Marca;
import com.chefcompany.apiclient.repository.carro.ICarroRepository;
import com.chefcompany.apiclient.repository.marca.IMarcaRepository;
import com.chefcompany.apiclient.util.Constants;
import com.chefcompany.apiclient.util.UtilStrings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class CarroService {

    @Autowired
    private ICarroRepository iCarroRepository;

    public Flux<Carro> get() {
        return iCarroRepository.findAll();
    }

    public Mono<Carro> save(Carro carro) {
        validationData(carro);
        return iCarroRepository.save(carro);
    }

    public Mono<Void> delete(String idCarro) {
        return iCarroRepository.findById(idCarro).flatMap(existingMarca -> iCarroRepository.deleteById(idCarro));
    }
    private void validationData(Carro carro) {

        UtilStrings.requieresNoNullOrNoEmpty(carro.getIdImagen(), String.format(Constants.TXT_EXPECT_VALUE, carro.getIdImagen()));
        UtilStrings.requieresNoNullOrNoEmpty(carro.getDescripcion(),String.format(Constants.TXT_EXPECT_VALUE, carro.getDescripcion()));
        UtilStrings.requieresNoNullOrNoEmpty(carro.getNombre(),String.format(Constants.TXT_EXPECT_VALUE, carro.getNombre()));
        UtilStrings.requieresNoNullOrNoEmpty(carro.getNombreMarca(),String.format(Constants.TXT_EXPECT_VALUE, carro.getNombreMarca()));

    }
}
