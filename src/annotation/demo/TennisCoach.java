package annotation.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println("in tennis coach default constructor.");
	}

	@Override
	public String getDailyWorkuut() {
		// TODO Auto-generated method stub
		return "Get daily workout from tennis coach";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	/*
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */

	/*
	 * public FortuneService getFortuneService() { return fortuneService; }
	 * 
	 * @Autowired public void doSomeCrazyStuff(FortuneService fortuneService) {
	 * System.out.println("in tennis coach doSomeCrazyStuff."); this.fortuneService
	 * = fortuneService; }
	 */
}
