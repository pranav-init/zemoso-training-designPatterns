package com.decorator.decorator;

import com.decorator.notification.Notification;

public class NotificationDecorator implements Notification {
    Notification decoratedNotification;

    public NotificationDecorator(Notification decoratedNotification) {
        this.decoratedNotification = decoratedNotification;
    }

    @Override
    public void notifyUser() {
        decoratedNotification.notifyUser();
    }
}
