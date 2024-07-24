package com.excelr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.model.Institute;
import com.excelr.repo.InstituteRepo;

@RestController
@RequestMapping("/Institute")
public class InstituteController {
	
@Autowired InstituteRepo repo;
	
	@PutMapping("/saveInstitute")
	public Institute saveData(@RequestBody Institute  std) {
		Institute save=repo.save(std);
		return save;
	}
	
	@GetMapping("/getInstitute/{instituteId}")
	public List<Institute> getone(@PathVariable int instituteId) {
		Institute getall=repo.findById(instituteId).get();
		return (List<Institute>) getall;
	}


}
