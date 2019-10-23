package springIoc.demo;

public class TrackBallCoach implements Coach {

     private FortuneService fortuneService;

     public TrackBallCoach(FortuneService fortuneService) {
         this.fortuneService = fortuneService;
     }

    @Override
    public String getDailyWorkOut() {
        return "Spend 15 min Track coach";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
