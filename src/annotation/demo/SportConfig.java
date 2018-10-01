package annotation.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("annotation.demo")
public class SportConfig {
	@Bean("sadFortuneService")
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	@Bean("swimCoach")
	public Coach SwimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
