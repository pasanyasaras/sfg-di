package pasanyasara.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pasanyasara.sfgdi.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}