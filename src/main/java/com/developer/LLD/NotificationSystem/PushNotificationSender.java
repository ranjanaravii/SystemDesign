package com.developer.LLD.NotificationSystem;

import java.time.LocalDateTime;

public class PushNotificationSender implements SchedulableNotificationSender {

    @Override
    public void schedule(Notification notification, LocalDateTime dateTime) {
        System.out.println("Scheduling Push notification to " + notification.getRecipient() + " at " + dateTime);
    }

    @Override
    public void send(Notification notification) {
        System.out.println("Sending Push Notification to " + notification.getRecipient());
    }
}
