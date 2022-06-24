package com.exam.springbootms3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.springbootms3.entity.University;

public interface universityRepository extends JpaRepository<University,Integer> {
	

}
