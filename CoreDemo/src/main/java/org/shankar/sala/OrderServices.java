package org.shankar.sala;

import org.shankar.sala.notification.EmailService;
import org.shankar.sala.notification.Notification;
import org.shankar.sala.notification.PopUpNotificationService;

public class OrderServices {

//    EmailService notification = new EmailService();

//    Notification Notify = new PopUpNotificationService();

    Notification notify;

    public OrderServices(Notification notify){
        this.notify = notify;
    }

    public void placeOrder(){
        System.out.println("Order placed");
        notify.sendNotification();
    }
}
