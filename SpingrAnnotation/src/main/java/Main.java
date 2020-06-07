import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldCOnfig.class);
		HelloWorld h = (HelloWorld) context.getBean("hello");
		System.out.println(h.getMessage());
		

		HelloWorld h1 = (HelloWorld) context.getBean(HelloWorld.class);
		System.out.println(h1.getMessage());
	}

}
