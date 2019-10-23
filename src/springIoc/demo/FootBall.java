package springIoc.demo;

public class FootBall implements Coach {

    private FortuneService fortuneService;
    private String name;
    private String email;

    @Override
    public String getDailyWorkOut() {
        return "Spend 4 hour training";
    }

    @Override
    public String getDailyFortune() {
        return "FootBall" + fortuneService.getFortune();
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
