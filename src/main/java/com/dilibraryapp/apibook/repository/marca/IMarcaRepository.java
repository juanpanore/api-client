package com.dilibraryapp.apibook.repository.marca;

import com.chefcompany.apiclient.domain.marca.Marca;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;


public interface IMarcaRepository extends ReactiveCrudRepository<Marca, String> {

}


