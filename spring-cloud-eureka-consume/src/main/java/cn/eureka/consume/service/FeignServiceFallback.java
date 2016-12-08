package cn.eureka.consume.service;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceFallback implements FeignService{

	@Override
	public String getHello() {
		return "fallback";
	}
}
