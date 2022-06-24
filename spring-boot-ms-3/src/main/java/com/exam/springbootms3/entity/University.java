package com.exam.springbootms3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="UNIVERSITY_TBLE")
public class University {
	// TODO Auto-generated constructor stub
	
	
	@Id
	private int id;
	private String name;
	private int totalColleges;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the totalColleges
	 */
	public int getTotalColleges() {
		return totalColleges;
	}
	/**
	 * @param totalColleges the totalColleges to set
	 */
	public void setTotalColleges(int totalColleges) {
		this.totalColleges = totalColleges;
	}
	public University(int id,String name, int totalColleges) {
		
		super();
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.totalColleges = totalColleges;
	
	}
	public University() {
		super();
		// TODO Auto-generated constructor stub
	}
	
     
    

}
