package springIoc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class SpringHelloApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");

      Coach coach =   context.getBean(FootBall.class);

      System.out.println(coach.getDailyWorkOut());

      context.close();
    }
}
