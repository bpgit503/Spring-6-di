package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingServiceImpl greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {

        System.out.println("Hello I am MyController");

        return greetingService.sayGreeting();
    }
}
