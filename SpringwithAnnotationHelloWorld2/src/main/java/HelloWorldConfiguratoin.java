import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguratoin {
	
	@Bean(name={"b1","b2"}) 
	public HelloWorld hello1()
	{
		return new HelloWorld();
	}

}
