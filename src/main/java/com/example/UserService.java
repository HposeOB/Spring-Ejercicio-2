package com.example;
import org.springframework.stereotype.Component;

@Component
public class UserService {


    NotificationService notification;

    public UserService(NotificationService notification){
        System.out.println("Iniciando constructor de UserService");
        this.notification = notification;
    }





}
