package com.chefcompany.apiclient.mensajeria.client;


import com.chefcompany.apiclient.service.client.ClientService;
import com.chefcompany.apiclient.util.gson.MapperJsonObjeto;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ReceiverMessages {

    @Autowired
    private ClientService clientService;

    @RabbitListener(queues = "${client.queue-procesar.cliente.queue-name}")
    public void receiveMessageProcessClient(String message) {
        try {

            //TODO Implementar JSONToObject
            //clientService.save();

            System.out.println(message);
        } catch (Exception e) {
            System.out.println(e);

        }
    }


}
