package com.excelr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/shopping")
public class MyShoppingController {
	
	@Autowired RestTemplate rest;
	
	@GetMapping("/test")
	public String testMethod() {
    return "welcome To shopping service";
	}
	
	@GetMapping("/amazon-payment/{price}")
	public String involepaymentService(@PathVariable double price) {
		String url="http://999-PAYMENT-SERVICE/payment/pay/"+price;
		return rest.getForObject(url,String.class);
	}
}
	
