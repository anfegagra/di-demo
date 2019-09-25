package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_KAKAROTO = "Hola, soy goku! - implementación original";

    @Override
    public String sayHello() {
        return HELLO_KAKAROTO;
    }
}
