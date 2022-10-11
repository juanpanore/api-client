package com.chefcompany.apiclient.service.client;

import java.util.Date;
import java.util.Objects;

import com.chefcompany.apiclient.util.MessageSender;
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

	private final MessageSender<Client> messageSenderClient;

	public ClientService(MessageSender<Client> messageSenderClient) {
		this.messageSenderClient = messageSenderClient;
	}


	public Mono<Client> get(String documentType, String documentNumber) {

		if (!Objects.isNull(documentType) && !Objects.isNull(documentNumber)) {
			UtilStrings.requiresPattern(documentNumber, Constants.TXT_PATTER_NUMBER,
					String.format(Constants.TXT_ONLY_NUMBERS, documentNumber));
			UtilStrings.requieresLength(documentType, 1, 1,
					String.format(Constants.TXT_NO_LENGTH_REQUIERED, documentType));
		}

		return iclientRepository.findByDocument(documentType, documentNumber);

	}

	public Mono<Client> save(Client client) {

		validationData(client);
		client.setCreatedDate(new Date());
		Mono<Client> savedClient = iclientRepository.save(client);
		savedClient.subscribe(
				value -> messageSenderClient.execute(client,value.getId()),
				error -> error.printStackTrace(),
				() -> System.out.println("Messages completed delivery")
		);
		return savedClient;
	}

	public Mono<Client> update(String clientId, Client client) {

		validationData(client);

		return iclientRepository.findById(clientId).flatMap(existingClient -> {
			existingClient.setDocumentType(
					client.getDocumentType().isEmpty() ? existingClient.getDocumentType() : client.getDocumentType());
			existingClient.setDocumentNumber(client.getDocumentNumber().isEmpty() ? existingClient.getDocumentNumber()
					: client.getDocumentNumber());
			existingClient.setFirstName(
					client.getFirstName().isEmpty() ? existingClient.getFirstName() : client.getFirstName());
			existingClient.setSecondName(
					client.getSecondName().isEmpty() ? existingClient.getSecondName() : client.getSecondName());
			existingClient
					.setLastName(client.getLastName().isEmpty() ? existingClient.getLastName() : client.getLastName());
			existingClient.setSecondSurname(client.getSecondSurname().isEmpty() ? existingClient.getSecondSurname()
					: client.getSecondSurname());
			existingClient.setSex(client.getSex().isEmpty() ? existingClient.getSex() : client.getSex());
			existingClient.setBirthDate(
					Objects.isNull(client.getBirthDate()) ? existingClient.getBirthDate() : client.getBirthDate());
			existingClient.setEmail(client.getEmail().isEmpty() ? existingClient.getEmail() : client.getEmail());
			existingClient.setCellphone(
					Objects.isNull(client.getCellphone()) ? existingClient.getCellphone() : client.getCellphone());
			existingClient.setCreatedDate(existingClient.getCreatedDate());
			existingClient.setModifiedDate(new Date());
			return iclientRepository.save(existingClient);
		});
	}

	public Mono<Void> delete(String clientId) {

		return iclientRepository.findById(clientId).flatMap(existingClient -> iclientRepository.deleteById(clientId));
	}

	private void validationData(Client client) {

		UtilStrings.requieresNoNullOrNoEmpty(client.getDocumentType(),
				String.format(Constants.TXT_EXPECT_VALUE, client.getDocumentType()));
		UtilStrings.requieresNoNullOrNoEmpty(client.getDocumentNumber(),
				String.format(Constants.TXT_EXPECT_VALUE, client.getDocumentNumber()));
		UtilStrings.requieresNoNullOrNoEmpty(client.getFirstName(),
				String.format(Constants.TXT_EXPECT_VALUE, client.getFirstName()));
		UtilStrings.requieresNoNullOrNoEmpty(client.getLastName(),
				String.format(Constants.TXT_EXPECT_VALUE, client.getLastName()));
		UtilStrings.requieresNoNullOrNoEmpty(client.getLastName(),
				String.format(Constants.TXT_EXPECT_VALUE, client.getLastName()));

		UtilStrings.requieresNoNullOrNoEmpty(client.getSex(),
				String.format(Constants.TXT_EXPECT_VALUE, client.getSex()));
		UtilStrings.requieresNoNullOrNoEmpty(client.getEmail(),
				String.format(Constants.TXT_EXPECT_VALUE, client.getEmail()));
		UtilStrings.requieresNoNullOrNoEmpty(client.getCellphone().toString(),
				String.format(Constants.TXT_EXPECT_VALUE, client.getCellphone().toString()));
		UtilStrings.requieresNoNullOrNoEmpty(client.getBirthDate().toString(),
				String.format(Constants.TXT_EXPECT_VALUE, client.getBirthDate().toString()));

		UtilStrings.requiresPattern(client.getDocumentNumber(), Constants.TXT_PATTER_NUMBER,
				String.format(Constants.TXT_ONLY_NUMBERS, client.getDocumentNumber()));

		UtilStrings.requieresLength(client.getDocumentType(), 1, 1,
				String.format(Constants.TXT_NO_LENGTH_REQUIERED, client.getDocumentType()));
		UtilStrings.requieresLength(client.getSex(), 1, 1,
				String.format(Constants.TXT_NO_LENGTH_REQUIERED, client.getSex()));
		UtilStrings.requieresLength(client.getCellphone().toString(), 10, 10,
				String.format(Constants.TXT_NO_LENGTH_REQUIERED, client.getCellphone().toString()));
		UtilStrings.requiresPattern(client.getEmail(), Constants.TXT_PATTER_EMAIL,
				String.format(Constants.TXT_BAD_EMAIL, client.getEmail()));

	}

}
