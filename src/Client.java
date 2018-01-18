import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource r = new ClassPathResource("Employeebean.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
		Employee e1 = (Employee) factory.getBean("emp1");
System.out.println("Employee" +e1);
	}

}
