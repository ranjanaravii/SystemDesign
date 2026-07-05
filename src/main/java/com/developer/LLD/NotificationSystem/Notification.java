package com.developer.LLD.NotificationSystem;

public interface Notification {

    Channel getChannel();
    String getRecipient();
    String getContent();
}
