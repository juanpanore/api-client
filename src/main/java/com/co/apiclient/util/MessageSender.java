package com.co.apiclient.util;

public interface MessageSender<T> {
    void execute(T message, String idMessage);
}
