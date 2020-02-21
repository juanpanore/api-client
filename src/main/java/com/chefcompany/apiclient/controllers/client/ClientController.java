package com.chefcompany.apiclient.controllers.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chefcompany.apiclient.domain.client.Client;
import com.chefcompany.apiclient.domain.general.Response;
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
	public Mono<Client> getClient(@RequestParam(required = true) String documentType, String documentNumber) {

		Mono<Client> client = clientService.getClient(documentType, documentNumber);
		if (client.equals(null)) {
			return null;
		}

		return client;
	}

}
