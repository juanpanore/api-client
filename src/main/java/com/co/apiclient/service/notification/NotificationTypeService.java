package com.co.apiclient.service.notification;

import com.co.apiclient.domain.notification.NotificationType;
import com.co.apiclient.repository.notification.INotificationTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class NotificationTypeService {

    @Autowired
    private INotificationTypeRepository iNotificationTypeRepository;
    public Flux<NotificationType> getAll() {
        return iNotificationTypeRepository.findAll();
    }

}
