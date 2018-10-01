package annotation.demo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkuut() {
		// TODO Auto-generated method stub
		return "Get daily workout from tennis coach";
	}

}
