package com.developer.LLD.NotificationSystem;

public class Push implements Notification {

    private final String deviceId;
    private final String title;
    private final String payload;

    public Push(String deviceId, String title, String payload) {
        this.deviceId = deviceId;
        this.title = title;
        this.payload = payload;
    }


    @Override
    public Channel getChannel() {
        return Channel.PUSH;
    }

    @Override
    public String getRecipient() {
        return deviceId;
    }

    @Override
    public String getContent() {
        return payload;
    }

    public String getTitle() {
        return title;
    }
}
