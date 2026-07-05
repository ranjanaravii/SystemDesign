package com.developer.LLD.NotificationSystem;

import java.time.LocalDateTime;

public interface SchedulableNotificationSender extends NotificationSender {
    void schedule(Notification notification, LocalDateTime dateTime);
}
