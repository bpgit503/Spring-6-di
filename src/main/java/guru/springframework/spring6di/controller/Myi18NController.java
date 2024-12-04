package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Myi18NController implements GreetingService {

    private final GreetingService greetingService;

    public Myi18NController(@Qualifier("myi18NService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    @Override
    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}
