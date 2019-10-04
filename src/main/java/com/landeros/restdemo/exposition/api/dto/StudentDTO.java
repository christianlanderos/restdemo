package com.landeros.restdemo.exposition.api.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7039623303151574633L;

	private Long id;
	private String name;
	private String apePat;
	private String apeMat;
	private Integer age;
	private Boolean isActive;

	public StudentDTO() {}
	
	public StudentDTO(Long id, String name, String apePat, String apeMat, Integer age, Boolean isActive) {
		
		this.id = id;
		this.name = name;
		this.apePat = apePat;
		this.apeMat = apeMat;
		this.age = age;
		this.isActive = isActive;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getApePat() {
		return apePat;
	}
	public void setApePat(String apePat) {
		this.apePat = apePat;
	}
	public String getApeMat() {
		return apeMat;
	}
	public void setApeMat(String apeMat) {
		this.apeMat = apeMat;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	
}
