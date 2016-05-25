import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContainer {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		A a1=(A)context.getBean("a");
		
	}

}
