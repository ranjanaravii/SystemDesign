package com.developer.LLD.NotificationSystem;

import java.time.LocalDateTime;

public class NotificationDispatcher {

    private final NotificationSenderFactory notificationSenderFactory;


    public NotificationDispatcher(NotificationSenderFactory notificationSenderFactory) {
        this.notificationSenderFactory = notificationSenderFactory;
    }

    public void dispatch(Notification notification) {
        notificationSenderFactory.getNotificationSender(notification.getChannel())
                .ifPresentOrElse(
                        sender -> sender.send(notification),
                        () -> System.out.println("Unsupported notification channel.")
                );
    }

    public void schedule(Notification notification, LocalDateTime dateTime) {
        notificationSenderFactory.getSchedulableSender(notification.getChannel())
                .ifPresentOrElse(
                        scheduler -> scheduler.schedule(notification, dateTime),
                        () -> System.out.println("Scheduling not supported for channel: " + notification.getChannel())
                );
    }
}
