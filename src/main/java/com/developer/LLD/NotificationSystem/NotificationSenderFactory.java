package com.developer.LLD.NotificationSystem;

import java.util.Optional;

public interface NotificationSenderFactory {
    Optional<NotificationSender> getNotificationSender(Channel channel);
    Optional<SchedulableNotificationSender> getSchedulableSender(Channel channel);
}
