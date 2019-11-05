package cl.timestamp.devops.poc.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloWorldController {
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello World PoC Ismael Martes 16:37.00 !!!";
    }
}
