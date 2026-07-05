package com.developer.LLD.NotificationSystem;

public class Email implements Notification {

    private final String toEmail;
    private final String body;
    private final String subject;

    public Email(String toEmail, String body, String subject) {
        this.toEmail = toEmail;
        this.body = body;
        this.subject = subject;
    }


    public String getSubject() {
        return subject;
    }

    @Override
    public Channel getChannel() {
        return Channel.EMAIL;
    }

    @Override
    public String getRecipient() {
        return toEmail;
    }

    @Override
    public String getContent() {
        return body;
    }
}
