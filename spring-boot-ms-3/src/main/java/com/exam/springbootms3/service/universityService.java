package com.exam.springbootms3.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.springbootms3.entity.University;
import com.exam.springbootms3.repository.universityRepository;

@Service
public class universityService {
	@Autowired
	private universityRepository repository;
	
	public University saveUniversity(University university) {
		return repository.save(university);
		
	}
	

	public List<University> saveUniversity(List<University> universities) {
		return repository.findAll();
		
	}
	
	public List<University> getAllUniversities(){
		return repository.findAll();
	}
	
	public University getUniversityById(int id){
		return repository.findById(id).orElse(null);
	}
	
	
	//delete
	public String deleteUniversity(int id) {
		repository.deleteById(id);
		return "universityDeleted";
	}
	
	//update
	public University updateUniversity(University university) {
		University existingUniversity=repository.findById(university.getId()).orElse(null);
		existingUniversity.setName(university.getName());
		existingUniversity.setTotalColleges(university.getTotalColleges());
		return repository.save(existingUniversity);
		
	}
	

}
