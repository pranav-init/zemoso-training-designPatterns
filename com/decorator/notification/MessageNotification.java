package com.decorator.notification;

public class MessageNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("OTP : 125486");
    }
}
