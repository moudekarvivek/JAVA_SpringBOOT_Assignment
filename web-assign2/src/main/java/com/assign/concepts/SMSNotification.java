package com.assign.concepts;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class SMSNotification implements NotificationService{
    @Override
    public void sendNotification(String message) {

        System.out.println("Sending SMS Notification "+message);
    }
}
