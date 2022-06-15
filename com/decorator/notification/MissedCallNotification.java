package com.decorator.notification;

public class MissedCallNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Missed call from +919999999999");
    }
}
