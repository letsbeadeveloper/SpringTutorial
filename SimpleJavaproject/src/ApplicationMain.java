import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMain {
	
	public static void main(String[] args) {
		
		HelloWorld h = new HelloWorld();
		System.out.println(h.getMessage());
	
		
		ApplicationContext context= new AnnotationConfigApplicationContext(HelloWorldCOnfiguration.class);
		HelloWorld hellowithspring = (HelloWorld) context.getBean("hello");
		System.out.println("with Spring : "+ hellowithspring.getMessage());
		
		
		System.out.println("#####################################################");
		ApplicationContext contextxml= new ClassPathXmlApplicationContext("services.xml");
		
		
		HelloWorld hellowithspringxml = (HelloWorld) contextxml.getBean("helloworld");
		
		System.out.println("with Spring XML : "+ hellowithspringxml.getMessage());
		
	}

}
