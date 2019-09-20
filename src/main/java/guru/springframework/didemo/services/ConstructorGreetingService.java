package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayHello() {
        return "Hola - fui inyectado por constructor";
    }
}
