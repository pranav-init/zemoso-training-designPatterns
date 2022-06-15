package com.decorator.decorator;

import com.decorator.notification.MessageNotification;
import com.decorator.notification.MissedCallNotification;
import com.decorator.notification.Notification;

public class TrueCallerNotificationDecorator extends NotificationDecorator {

    public TrueCallerNotificationDecorator(Notification decoratedNotification) {
        super(decoratedNotification);
    }

    public void notifyUser() {
        if(decoratedNotification instanceof MissedCallNotification) {
            System.out.println("Spam caller");
            System.out.println("Red border");
        }

        else if(decoratedNotification instanceof MessageNotification) {
            System.out.println("Round black border");
            System.out.println("First four letters of OTP encrypted.");
        }
        decoratedNotification.notifyUser();
    }
}
