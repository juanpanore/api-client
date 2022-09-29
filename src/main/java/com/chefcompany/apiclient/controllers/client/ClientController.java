package com.chefcompany.apiclient.controllers.client;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chefcompany.apiclient.domain.client.Client;
import com.chefcompany.apiclient.service.client.ClientService;

import reactor.core.publisher.Mono;

/**
 *
 * @author chefcompany.co
 */
@RestController
@RequestMapping("/api/v1/rest")

public class ClientController {

	@Autowired
	private ClientService clientService;

	@GetMapping("/client")
	public Mono<Client> get(@RequestParam(required = true) String documentType, String documentNumber) {

		return clientService.get(documentType, documentNumber);
	}

	@PostMapping("/client")
	public Mono<Client> create(@Valid @RequestBody Client client) {
		return clientService.save(client);
	}

	@PutMapping("/client")
	public Mono<ResponseEntity<Client>> update(@RequestParam(required = true) String clientId,
			@Valid @RequestBody Client client) {

		return clientService.update(clientId, client).map(updatedClient -> new ResponseEntity<>(updatedClient, HttpStatus.OK))
				.defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));

	}
	
	@DeleteMapping("/client")
	public Mono<ResponseEntity<Void>> delete (@RequestParam(required = true) String clientId){
		
		return clientService.delete(clientId).then(Mono.just(new ResponseEntity<Void>(HttpStatus.OK)))
				.defaultIfEmpty(new ResponseEntity<Void>(HttpStatus.NOT_FOUND));
		
		
	}
	
	

}
