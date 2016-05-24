import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringContainer {
	public static void main(String[] args) {
		Resource res=new ClassPathResource("Spring.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Object o=factory.getBean("reportservice");
		ReportService rs=(ReportService)o;
		rs.showReoprts();
	}

}
