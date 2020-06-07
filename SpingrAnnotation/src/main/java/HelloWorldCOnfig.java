import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldCOnfig {
	
	@Bean
	
	public HelloWorld hello()
	{
		return new HelloWorld();
	}
	

}
