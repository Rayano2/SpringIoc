package springIoc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class SpringHelloApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");

      Coach coach =   context.getBean("trackCoach",Coach.class);
//        FootBall footBall =   context.getBean("footballCoach",FootBall.class);


        System.out.println(coach.getDailyWorkOut());
      System.out.println(coach.getDailyFortune());
//      System.out.println(footBall.getEmail());
//      System.out.println(footBall.getName());
      context.close();
    }
}
