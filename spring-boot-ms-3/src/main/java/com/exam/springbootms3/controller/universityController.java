package com.exam.springbootms3.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.springbootms3.entity.University;
import com.exam.springbootms3.service.universityService;

@RestController
public class universityController {
	
	@Autowired
	private universityService service;
	
	
	@GetMapping("/universities")
	public List<University>getUnversities(){
		return service.getAllUniversities();
	}
	
	@PostMapping("/addUniversity")
	public University addUniversity(@RequestBody University university) {
		return service.saveUniversity(university);
		
	}
	
	@PostMapping("/addUniversities")
	public List<University> addUniversities(@RequestBody List<University> universities) {
		return service.saveUniversity(universities);
		
	}
	@PutMapping("/universities")
	public University updateUniversity(@RequestBody University university) {
		return service.updateUniversity(university);
	}
	
	@DeleteMapping("/universities/{id}")
	public String deleteUniversity(@PathVariable int id){
		return service.deleteUniversity(id);
	}
	

	
}
