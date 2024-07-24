package com.excelr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.model.Student;
import com.excelr.repo.StudentRepo;


@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired StudentRepo repo;
	
	@PutMapping("/save")
	public Student saveData(@RequestBody Student std) {
		Student save=repo.save(std);
		return save;
	}
	
	@GetMapping("/getStudent/{instituteCenterId}")
	public List<Student> getone(@PathVariable int instituteCenterId) {
		List<Student> getall=repo.findByinstituteCenterId(instituteCenterId);
		return getall;
	}

}
