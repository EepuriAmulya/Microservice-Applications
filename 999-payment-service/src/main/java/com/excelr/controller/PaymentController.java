package com.excelr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@GetMapping("/test")
	public String testEndpoint() {
		return "Welcome to Payment service REST API Application";
		
	}
	@GetMapping("/pay/{price}")
	public String payGateWay(@PathVariable double price) {
		return "Your payment "+price+"Succesfully Paid...";
      
	}

	
}
