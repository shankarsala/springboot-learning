package org.shankar.sala;

import org.shankar.sala.notification.EmailService;
import org.shankar.sala.notification.Notification;
import org.shankar.sala.notification.PopUpNotificationService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        Notification notifyNew = new PopUpNotificationService();
        OrderServices order = new OrderServices(notifyNew);
        order.placeOrder();
//        System.out.println("Hello");
    }
}
