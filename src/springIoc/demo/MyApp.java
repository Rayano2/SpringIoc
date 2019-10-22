package springIoc.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class MyApp {

    public static void main(String[] args) {
        AppletContext appletContext = (AppletContext) new ClassPathXmlApplicationContext();

         Coach coach = new TrackBallCoach();

         System.out.println(coach.getDailyWorkOut());
    }
}
