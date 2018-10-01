
public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String email;
	private String team;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("cricket coach constructor.");
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "get daily work out from cricket coach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("cricket coach set fortune.");
		this.fortuneService = fortuneService;
	}

}
