import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jagan.bean.MovieFinder;
import com.jagan.bean.MovieListener;

public class SpringContainer {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("AppicationContextConfig.xml");
		//calling movieListener bean created by IOC container using <context:component-scan> in Xml file
		System.out.println("\n\ncalling movieListener bean created by IOC container using <context:component-scan> in Xml file");
		MovieListener listener=(MovieListener)context.getBean("movieListener");
		listener.searchMovie1();
		
		//calling explicitly created bean :finderMovie
		System.out.println("\n\ncalling explicitly created bean :finderMovie");
		MovieFinder finder=(MovieFinder)context.getBean("finderMovie") ;
		finder.searchMovie();
		
	}

}
