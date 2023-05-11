package com.co.apiclient.repository.client;

import com.co.apiclient.domain.client.Client;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import reactor.core.publisher.Mono;


public interface IClientRepository extends ReactiveCrudRepository<Client, String>{

	@Query("{ 'documentType': ?0, 'documentNumber': ?1}")
	Mono<Client> findByDocument(String documentType, String documentNumber);
}
