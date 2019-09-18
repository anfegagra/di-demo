package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_KAKAROTO, constructorInjectedController.sayHello());
    }
}
