package cn.eureka.consume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.eureka.consume.service.ConsumeService;
import cn.eureka.consume.service.FeignService;

@RestController
public class ConsumeController {

	@Autowired
	private ConsumeService consumeService;
	
	@Autowired
	private FeignService feignService;
	
	@GetMapping("/qryHello")
	public String hello(){
		return consumeService.getHello();
	}
	
	@GetMapping("/qryhellobyfeign")
	public String getHelloByFeign(){
		return feignService.getHello();
	}
	
}
