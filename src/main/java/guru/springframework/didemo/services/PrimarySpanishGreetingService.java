package guru.springframework.didemo.services;

public class PrimarySpanishGreetingService implements GreetingService {

	private GreetingRepository greetingRepository;

	public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayHello() {
		return greetingRepository.getSpanishGreeting();
	}
}
