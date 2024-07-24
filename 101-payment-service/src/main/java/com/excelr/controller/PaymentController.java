package com.excelr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.model.Payment;
import com.excelr.repo.PaymentRepo;


	@RestController
	@RequestMapping("/payment")
	public class PaymentController {
		
		@Autowired PaymentRepo repo;
		
		@PutMapping("/save")
		public Payment saveData(@RequestBody Payment pays) {
			Payment save=repo.save(pays);
			return save;
		}
		
		@GetMapping("/getpayment/{companyId}")
		public List<Payment> getone(@PathVariable int companyId) {
			List<Payment> getall=repo.findByinstituteCenterId(companyId);
			return getall;
		}

	}


