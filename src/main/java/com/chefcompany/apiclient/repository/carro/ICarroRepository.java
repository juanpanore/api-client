package com.chefcompany.apiclient.repository.carro;

import com.chefcompany.apiclient.domain.carro.Carro;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ICarroRepository extends ReactiveCrudRepository<Carro, String> {
}
