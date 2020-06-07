import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldCOnfiguration {
	
	
	@Bean
	public HelloWorld hello()
	{
		return new HelloWorld();
	}

}
