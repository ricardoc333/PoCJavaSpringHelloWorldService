package cl.timestamp.devops.poc;

import cl.timestamp.devops.poc.controller.HelloWorldController;
import org.springframework.boot.SpringApplication;

public class SpringBootApplicationLuncher {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldController.class, args);
    }
}
