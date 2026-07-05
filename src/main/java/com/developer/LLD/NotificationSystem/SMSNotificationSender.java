package com.developer.LLD.NotificationSystem;

import java.time.LocalDateTime;

public class SMSNotificationSender implements SchedulableNotificationSender {

    @Override
    public void schedule(Notification notification, LocalDateTime dateTime) {
        System.out.println("Scheduling SMS to " + notification.getRecipient() + " at " + dateTime);
    }

    @Override
    public void send(Notification notification) {
        System.out.println("Sending SMS to " + notification.getRecipient());
    }
}
