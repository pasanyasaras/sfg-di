package pasanyasara.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import pasanyasara.sfgdi.services.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello()
    {
        //System.out.println("Hello World!!");
        //return "Hello Machan!!!";
        return greetingService.sayGreeting();
    }
}
