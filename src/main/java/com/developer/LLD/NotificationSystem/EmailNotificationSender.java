package com.developer.LLD.NotificationSystem;

import java.time.LocalDateTime;

public class EmailNotificationSender implements SchedulableNotificationSender {

    @Override
    public void schedule(Notification notification, LocalDateTime dateTime) {
        System.out.println("Scheduling EMAIL to " + notification.getRecipient() + " at " + dateTime);
    }

    @Override
    public void send(Notification notification) {
        System.out.println("Sending EMAIL to " + notification.getRecipient());
    }
}
