
public class Trackcoach implements Coach {

	private FortuneService fortuneService;

	public Trackcoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "get daily work out from Track Coach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}

	public void initMethod() {
		System.out.println("inside init method");
	}

	public void destroyMethod() {
		System.out.println("inside init method");
	}

}
