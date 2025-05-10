package com.co.apiclient.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ConfigurationProperties(prefix = "client.procesar")
@PropertySource("classpath:client.properties")
public class ClientQueueConfig {

    private String exchangeName;
    private String routingKeyName;
    private String queueName;

    public String getExchangeName() {
        return exchangeName;
    }

    public String getRoutingKeyName() {
        return routingKeyName;
    }

    public void setRoutingKeyName(String routingKeyName) {
        this.routingKeyName = routingKeyName;
    }

    public String getQueueName() {
        return queueName;
    }

    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }


    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }
}
