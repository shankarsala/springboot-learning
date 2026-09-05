package org.shankar.sala.notification;

public class EmailService implements Notification{


    @Override
    public void sendNotification(){
        System.out.println("Email notification sent");
    }
}
