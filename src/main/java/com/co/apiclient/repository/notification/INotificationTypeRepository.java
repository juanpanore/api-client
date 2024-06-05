package com.co.apiclient.repository.notification;

import com.co.apiclient.domain.notification.NotificationType;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface INotificationTypeRepository extends ReactiveCrudRepository<NotificationType, String> {


}
