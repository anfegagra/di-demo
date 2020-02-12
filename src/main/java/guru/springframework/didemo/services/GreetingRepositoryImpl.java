package guru.springframework.didemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

	@Override
	public String getPrimaryGreeting() {
		return "Primary service";
	}

	@Override
	public String getSpanishGreeting() {
		return "Servicio de saludo primario";
	}

	@Override
	public String getGermanGreeting() {
		return "Primärer Begrüßungsdienst";
	}
}
