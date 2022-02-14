package pasanyasara.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pasanyasara.sfgdi.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());;
    }
}
