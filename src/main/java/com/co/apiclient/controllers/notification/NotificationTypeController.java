package com.co.apiclient.controllers.notification;

import com.co.apiclient.domain.notification.NotificationType;
import com.co.apiclient.service.notification.NotificationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;


@RestController
@RequestMapping("/api/v1/rest")
public class NotificationTypeController {

    @Autowired
    private NotificationTypeService notificationTypeService;
    @GetMapping("/notifications/type")
    public Flux<NotificationType> getAll() {
        return notificationTypeService.getAll();
    }
}
