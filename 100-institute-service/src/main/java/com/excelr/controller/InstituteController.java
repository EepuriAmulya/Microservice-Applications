package com.excelr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.excelr.model.Institute;
import com.excelr.model.RequiredResponse;
import com.excelr.model.Student;
import com.excelr.repo.InstituteRepo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/Institute")
public class InstituteController{
	
@Autowired InstituteRepo repo;

@Autowired RestTemplate resttemplate;
	
	@PutMapping("/saveInstitute")
	public Institute saveData(@RequestBody Institute  std) {
		Institute save=repo.save(std);
		return save;
	}
	
	@GetMapping("/getInstitute/{instituteId}")
	public Institute getone(@PathVariable int instituteId) {
		Institute getone=repo.findById(instituteId).get();
		return getone;
	}
	
	@GetMapping("/get/{instituteId}")
	@HystrixCommand(fallbackMethod="handleCitizenDownTime")
	public RequiredResponse getData(@PathVariable int instituteId) {
		RequiredResponse requiredresponse=new RequiredResponse();
		
	     Institute insti=repo.findById(instituteId).get();
		requiredresponse.setInstitute(insti);
		
		List<Student> listofstudents=resttemplate.getForObject("http://STUDENT-SERVICE/student/getStudent/"+instituteId,List.class);
		requiredresponse.setStudents(listofstudents);
		return requiredresponse;
		
	}
	
	@GetMapping("/getInsti/{instituteId}")
	public ResponseEntity<Institute> getOne(@PathVariable int instituteId)
	{
		RequiredResponse requiredResponse=new RequiredResponse();
		
		// This is for Institute Details
		Institute center=repo.findById(instituteId).get();
		return new ResponseEntity<Institute>(center,HttpStatus.OK);
		//return ResponseEntity<center>;
	}


}
