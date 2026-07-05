package com.developer.LLD.NotificationSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class DefaultNotificationSenderFactory implements NotificationSenderFactory {

    private final Map<Channel, NotificationSender> senderMap;
    private final Map<Channel, SchedulableNotificationSender> schedulableSenderMap;

    public DefaultNotificationSenderFactory() {
        this.senderMap = new HashMap<>();
        this.schedulableSenderMap = new HashMap<>();

        EmailNotificationSender email = new EmailNotificationSender();
        PushNotificationSender push = new PushNotificationSender();
        SMSNotificationSender sms = new SMSNotificationSender();

        senderMap.put(Channel.EMAIL, email);
        senderMap.put(Channel.PUSH, push);
        senderMap.put(Channel.SMS, sms);

        schedulableSenderMap.put(Channel.EMAIL, email);
        schedulableSenderMap.put(Channel.PUSH, push);
        schedulableSenderMap.put(Channel.SMS, sms);

    }

    @Override
    public Optional<NotificationSender> getNotificationSender(Channel channel) {
        return Optional.ofNullable(senderMap.get(channel));
    }

    @Override
    public Optional<SchedulableNotificationSender> getSchedulableSender(Channel channel) {
        return Optional.ofNullable(schedulableSenderMap.get(channel));
    }
}
