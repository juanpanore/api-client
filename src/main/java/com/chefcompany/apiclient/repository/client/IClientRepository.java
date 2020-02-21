package com.chefcompany.apiclient.repository.client;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.chefcompany.apiclient.domain.client.Client;

import reactor.core.publisher.Mono;


public interface IClientRepository extends ReactiveCrudRepository<Client, String>{

	@Query("{ 'documentType': ?0, 'documentNumber': ?1}")
	Mono<Client> findByDocument(String documentType, String documentNumber);
}
