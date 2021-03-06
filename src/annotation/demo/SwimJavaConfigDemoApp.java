package annotation.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach theCoach = (Coach) context.getBean("swimCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkuut());

		System.out.println(theCoach.getDailyFortune());
		((AbstractApplicationContext) context).close();
	}

}
