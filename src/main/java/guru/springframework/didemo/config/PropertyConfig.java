package guru.springframework.didemo.config;

import guru.springframework.didemo.examplebeans.FakeDataSource;
import guru.springframework.didemo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
//@PropertySources({
//	@PropertySource("classpath:datasource.properties"),
//	@PropertySource("classpath:jms.properties")
//})
public class PropertyConfig {

	@Value("${guru.username}")
	String username;

	@Value("${guru.pass}")
	String pass;

	@Value("${guru.url}")
	String url;

	@Value("${guru.jms.username}")
	String jmsUsername;

	@Value("${guru.jms.password}")
	String jmsPassword;

	@Value("${guru.jms.url}")
	String jmsUrl;

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

	@Bean
	public FakeJmsBroker fakeJmsBroker() {
		FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
		fakeJmsBroker.setUsername(jmsUsername);
		fakeJmsBroker.setPassword(jmsPassword);
		fakeJmsBroker.setUrl(jmsUrl);
		return fakeJmsBroker;
	}

}
