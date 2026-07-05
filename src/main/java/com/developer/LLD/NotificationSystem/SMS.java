package com.developer.LLD.NotificationSystem;

public class SMS implements Notification {

    private final String phoneNumber;
    private final String message;

    public SMS(String phoneNumber, String message) {
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    @Override
    public Channel getChannel() {
        return Channel.SMS;
    }

    @Override
    public String getRecipient() {
        return phoneNumber;
    }

    @Override
    public String getContent() {
        return message;
    }
}
