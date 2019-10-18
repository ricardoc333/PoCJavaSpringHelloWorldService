package cl.timestamp.devops.poc;

import cl.timestamp.devops.poc.controller.HelloWorldController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootApplicationLuncher extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldController.class, args);
    }
}
