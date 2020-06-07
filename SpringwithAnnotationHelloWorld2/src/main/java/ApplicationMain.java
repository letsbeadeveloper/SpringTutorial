import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationMain {
	
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(HelloWorldConfiguratoin.class);
		HelloWorld hello = (HelloWorld) context.getBean("b1");
		
		System.out.println("B1 message"+hello.getMessage() + "  hashcode  ="+hello.hashCode());
		
		
		
	HelloWorld b2 = (HelloWorld) context.getBean("b2");
		
		System.out.println("B2 message"+b2.getMessage() + "  hashcode  ="+ b2.hashCode());
		HelloWorld hello2 = (HelloWorld) context.getBean(HelloWorld.class);
		
		
		System.out.println("Hellowworld by class"+hello2.getMessage());
		
		
	}

}
