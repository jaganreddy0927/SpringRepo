import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContainer {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		CollectionTestBean bean=(CollectionTestBean)context.getBean("collectionpropertytest");
		bean.Show();
	}

}
