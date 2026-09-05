package org.shankar.sala.notification;

public class PopUpNotificationService implements Notification{

    @Override
    public void sendNotification(){
        System.out.println("Pop-Up notification sent");
    }
}
