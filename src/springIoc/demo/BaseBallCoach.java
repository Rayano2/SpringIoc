package springIoc.demo;

public class BaseBallCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "Spend 30 min on batting practice";
    }
}
