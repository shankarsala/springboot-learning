package in.shankar.sala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
//        step-1 ioc container start
       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

       OrderService order = context.getBean(OrderService.class);
       order.placeOrder();

    }
}
