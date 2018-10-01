package annotation.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation-applicationContext.xml");
		Coach theCoach = (Coach) context.getBean("tennisCoach");
		System.out.println(theCoach.getDailyWorkuut());
		((AbstractApplicationContext) context).close();
	}

}
