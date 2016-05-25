package defaultPackage;

import org.jagan.com.Travel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContainer {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Travel travel=(Travel)context.getBean("travel");
		travel.journey();
	}
	
}
