import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		Coach theCoach = (Coach) context.getBean("myCoach");
		System.out.println(theCoach.getDailyWorkOut());
		((AbstractApplicationContext) context).close();
	}

}
