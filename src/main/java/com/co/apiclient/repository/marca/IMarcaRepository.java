package com.co.apiclient.repository.marca;

import com.co.apiclient.domain.marca.Marca;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;


public interface IMarcaRepository extends ReactiveCrudRepository<Marca, String> {

}


