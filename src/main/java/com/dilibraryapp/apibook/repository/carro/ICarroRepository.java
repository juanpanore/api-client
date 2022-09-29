package com.dilibraryapp.apibook.repository.carro;

import com.dilibraryapp.apibook.domain.carro.Carro;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ICarroRepository extends ReactiveCrudRepository<Carro, String> {
}
