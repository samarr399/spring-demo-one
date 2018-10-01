import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach theCoach = (Coach) context.getBean("myCoach");
		Coach alphaCoach = (Coach) context.getBean("myCoach");
		boolean result = (theCoach == alphaCoach);
		System.out.println("are objects same : " + result);
		System.out.println("Memory Location : " + theCoach);
		System.out.println("Memory Location : " + alphaCoach);
		((AbstractApplicationContext) context).close();
	}

}
