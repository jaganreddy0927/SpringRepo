
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sathya.bean.MyBean;
public class SpringContainer {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		MyBean bean1=(MyBean)context.getBean("mybean");
		bean1.method1();
		
		
	}
	
}
