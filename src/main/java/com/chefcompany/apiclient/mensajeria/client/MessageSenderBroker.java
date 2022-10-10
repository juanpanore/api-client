package com.chefcompany.apiclient.mensajeria.client;


import com.chefcompany.apiclient.domain.client.Client;
import com.chefcompany.apiclient.util.gson.MapperJsonObjeto;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.core.MessagePropertiesBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component



public class MessageSender  implements com.chefcompany.apiclient.util.MessageSender<Client> {

    private final RabbitTemplate rabbitTemplate;
    private final MapperJsonObjeto mapperJsonObjeto;

    public MessageSender(RabbitTemplate rabbitTemplate, MapperJsonObjeto mapperJsonObjeto) {
        this.rabbitTemplate = rabbitTemplate;
        this.mapperJsonObjeto = mapperJsonObjeto;
    }

    public void sendMesagge(Object mensaje, Long idMensajeEmisor, String exchange, String routingKey) {

    }

    private MessageProperties generarPropiedadesMensaje(Long idMensajeEmisor ) {
        return MessagePropertiesBuilder.newInstance()
                .setContentType(MessageProperties.CONTENT_TYPE_JSON)
                .setHeader("idMensaje", String.valueOf(idMensajeEmisor))
                .build();
    }

    private Optional<Message> obtenerCuerpoMensaje(Object mensaje, MessageProperties propiedadesMensaje) {
        Optional<String> textoMensaje = mapperJsonObjeto.ejecutarGson(mensaje);

        return textoMensaje.map(msg -> MessageBuilder
                .withBody(msg.getBytes())
                .andProperties(propiedadesMensaje)
                .build());

    }


    @Override
    public void execute(Client message, Long idMessage, String exchange, String routingKey) {
        MessageProperties propiedadesMensaje = generarPropiedadesMensaje(idMessage);

        Optional<Message> cuerpoMensaje = obtenerCuerpoMensaje(message, propiedadesMensaje);
        if (!cuerpoMensaje.isPresent()) {
            return;
        }

        rabbitTemplate.convertAndSend(exchange, routingKey, cuerpoMensaje.get());
    }
}
