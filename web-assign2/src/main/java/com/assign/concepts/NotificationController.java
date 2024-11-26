package com.assign.concepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationController {

    @Autowired
  //  @Qualifier("EmailNotification")
    NotificationService notificationService;

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String message){

        notificationService.sendNotification(message);
    }
}
