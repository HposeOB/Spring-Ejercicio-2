package com.example;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService() {
        System.out.println("Iniciando constructor NotificationService");
    }
    public String imprimirSaludo(){
        return "Hola mundo";
    }


}
