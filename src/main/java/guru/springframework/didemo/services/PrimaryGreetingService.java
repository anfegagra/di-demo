package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayHello() {
        return "[ENGLISH] Hello - i am the primary bean";
    }
}
