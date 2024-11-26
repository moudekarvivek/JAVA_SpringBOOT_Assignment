package com.assign.concepts;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class EmailNotification implements NotificationService{
    @Override
    public void sendNotification(String message){

        System.out.println("Sending Email Notification "  +message);
    }
}
