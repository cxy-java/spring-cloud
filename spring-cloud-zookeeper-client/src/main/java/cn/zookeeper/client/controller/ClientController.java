package cn.zookeeper.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/gethello")
	public String getHello() {
		return restTemplate.getForObject("http://zkserver/hello", String.class);
	}
}
