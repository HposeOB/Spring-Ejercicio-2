package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        NotificationService service = (NotificationService) context.getBean("notificationService");
        System.out.println(service.imprimirSaludo());

        NotificationService service2 = (NotificationService) context.getBean("notificationService");
        System.out.println(service2.imprimirSaludo());

        UserService user = (UserService) context.getBean("userService");
        System.out.println(user.notification.imprimirSaludo());
    }
}
