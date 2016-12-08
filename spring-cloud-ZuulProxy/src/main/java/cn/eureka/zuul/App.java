package cn.eureka.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import cn.eureka.zuul.filter.AccessFilter;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableZuulProxy
@SpringCloudApplication
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
    
    @Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}

}
