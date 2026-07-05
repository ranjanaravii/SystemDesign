package com.developer.LLD.NotificationSystem;

import java.time.LocalDateTime;

public class NotificationDriver {

    public static void main(String[] args) {

        NotificationSenderFactory factory = new DefaultNotificationSenderFactory();
        NotificationDispatcher notificationDispatcher = new NotificationDispatcher(factory);

        Notification email = new Email("ravi@gmail.com", "Order Shipped", "Order - 1234567");
        notificationDispatcher.dispatch(email);
        notificationDispatcher.schedule(email, LocalDateTime.now().plusSeconds(10));


        Notification sms = new SMS("1234567890", "Hi there");
        notificationDispatcher.dispatch(sms);
        notificationDispatcher.schedule(sms, LocalDateTime.now().plusSeconds(30));
    }
}
