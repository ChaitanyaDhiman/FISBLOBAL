package springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {
	
	@Bean(name="adr")
	@Scope("prototype")
	public Address returnAddress() {
		return new Address(1010,"SD Road","Secunderabad");
	}
	
	@Bean
	public Engine getEngineObject() {
		return new Engine();
	}

}
