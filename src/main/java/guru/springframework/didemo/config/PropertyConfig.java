package guru.springframework.didemo.config;

import guru.springframework.didemo.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:datasource.properties")
@Configuration
public class PropertyConfig {

	@Value("${guru.username}")
	String username;

	@Value("${guru.pass}")
	String pass;

	@Value("${guru.url}")
	String url;

	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUsername(username);
		fakeDataSource.setPass(pass);
		fakeDataSource.setDbUrl(url);
		return fakeDataSource;
	}

//	@Bean
//	public static PropertySourcesPlaceholderConfigurer properties() {
//		return new PropertySourcesPlaceholderConfigurer();
//	}
}
