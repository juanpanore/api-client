package com.co.apiclient.repository.carro;

import com.co.apiclient.domain.carro.Carro;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ICarroRepository extends ReactiveCrudRepository<Carro, String> {

}
