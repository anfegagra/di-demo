package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_KAKAROTO, setterInjectedController.sayHello());
    }
}
