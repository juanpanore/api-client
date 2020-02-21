package com.chefcompany.apiclient.service.client;

import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chefcompany.apiclient.domain.client.Client;
import com.chefcompany.apiclient.repository.client.IClientRepository;
import com.chefcompany.apiclient.util.Constants;
import com.chefcompany.apiclient.util.UtilStrings;

import reactor.core.publisher.Mono;

/**
*
* @author chefcompany.co
*/
@Service
public class ClientService {
	@Autowired
	private IClientRepository iclientRepository;
	
	public Mono<Client> getClient(String documentType, String documentNumber) {
		
		if (!Objects.isNull(documentType) && !Objects.isNull(documentNumber)) {
			UtilStrings.requiresPattern(documentNumber, Constants.TXT_PATTER_NUMBER,
					String.format(Constants.TXT_ONLY_NUMBERS, documentNumber));
			UtilStrings.requieresLength(documentType, 1, 1,
					String.format(Constants.TXT_NO_LENGTH_REQUIERED, documentType));
		}

		Mono<Client> client = iclientRepository.findByDocument(documentType, documentNumber);
		
		return client;
		
	}

}
