package com.landeros.restdemo.service;

import java.util.List;

import com.landeros.restdemo.exposition.api.dto.StudentDTO;

public interface StudentService {

	public List<StudentDTO> find();
	
	public StudentDTO get(Long id);
	
	public StudentDTO create(StudentDTO studentDTO);
	
	public StudentDTO update(StudentDTO studentDTO);
	
	public Boolean delete(StudentDTO studentDTO);
}
