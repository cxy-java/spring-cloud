package cn.eureka.consume.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "provide", fallback = FeignServiceFallback.class)
public interface FeignService {

	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	String getHello();

}
