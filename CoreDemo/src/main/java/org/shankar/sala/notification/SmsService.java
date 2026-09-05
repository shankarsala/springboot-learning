package org.shankar.sala.notification;

public class SmsService implements Notification{

    @Override
    public void sendNotification(){
        System.out.println("SMS notification sent");
    }
}
