package com.chefcompany.apiclient.service.client;

public interface MessageSender<T> {
    void execute(T message, Long idMessage);
}
