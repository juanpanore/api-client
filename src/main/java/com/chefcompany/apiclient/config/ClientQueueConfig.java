package com.chefcompany.apiclient.mensajeria.client;


import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "mensaje.certificacion-usuarios.borrado")
public class PropertiesClientQueue {

    private String exchangeName;
    private String routingKey;
    private String queueName;
}
