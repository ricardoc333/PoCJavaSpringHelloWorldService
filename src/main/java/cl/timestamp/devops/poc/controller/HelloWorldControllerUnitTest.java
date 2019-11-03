package cl.timestamp.devops.poc.controller;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class HelloWorldControllerUnitTest {

    @Test
    public void sayHelloTest() {
        HelloWorldController homeController = new HelloWorldController();
        String result = homeController.sayHello();
        assertTrue(result.contains("Hello World PoC"));
    }
}
