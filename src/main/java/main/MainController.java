package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = { "com.main.ActionService" })
public class MainController {
    public static void main(String[] args){
        SpringApplication.run(MainController.class,args);
    }
}
