package springIoc.demo;

public class BaseBallCoach implements Coach {


    private FortuneService fortuneService;

    public BaseBallCoach (FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Spend 30 min on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
