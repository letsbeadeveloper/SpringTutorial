import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 */

/**
 * @author admin
 *
 */
public class ApplicatoinMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext("service.xml");
		HelloWorld hello =(HelloWorld) context.getBean("hello");
		System.out.println(hello.getMessage());
		
		
		
		
		
		

	}

}
