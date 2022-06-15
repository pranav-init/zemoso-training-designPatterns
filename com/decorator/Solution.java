//Decorator DP

package com.decorator;

import com.decorator.decorator.TrueCallerNotificationDecorator;
import com.decorator.notification.MessageNotification;
import com.decorator.notification.MissedCallNotification;
import com.decorator.notification.Notification;

public class Solution {
    public static void main(String[] args) {
        Notification newNotification;

        System.out.println("------ \n Notification 1 \n--------- \n");
        newNotification = new TrueCallerNotificationDecorator(new MissedCallNotification());
        newNotification.notifyUser();

        System.out.println("------ \n Notification 2 \n---------- \n");
        newNotification = new TrueCallerNotificationDecorator(new MessageNotification());
        newNotification.notifyUser();

    }
}
