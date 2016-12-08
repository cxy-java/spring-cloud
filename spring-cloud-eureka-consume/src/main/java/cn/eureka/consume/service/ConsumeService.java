package cn.eureka.consume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ConsumeService {

	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "fallback")
	public String getHello() {
		return restTemplate.getForObject("http://provide/hello", String.class);
	}
	
	/**
	 * 熔断函数 参数和返回类型同主方法要一致
	 * @return
	 */
	public String fallback(){
		System.out.println("熔断测试===========================");
		return "Hystrix";
	}
}
