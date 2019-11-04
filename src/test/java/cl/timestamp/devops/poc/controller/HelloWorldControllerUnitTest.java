package cl.timestamp.devops.poc.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HelloWorldControllerUnitTest {

    @Test
    public void sayHelloTest() {
        HelloWorldController homeController = new HelloWorldController();
        String result = homeController.sayHello();
        assertTrue(result.contains("Hello World PoC"));
    }
}
