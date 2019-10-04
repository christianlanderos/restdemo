package com.landeros.restdemo.exposition.ws.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.landeros.restdemo.exposition.api.dto.StudentDTO;
import com.landeros.restdemo.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentRest {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<StudentDTO> find() {
		
		List<StudentDTO> studentDTOList = null;
		
		studentDTOList = studentService.find();
		
		return studentDTOList;
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public StudentDTO get(@PathVariable("id") Long id) {
		
		StudentDTO studentDTO = null;
		
		studentDTO = studentService.get( id );
		
		return studentDTO;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public List<StudentDTO> create( StudentDTO studentDTO ) {
		
		List<StudentDTO> studentDTOList = null;

		studentService.create( studentDTO );
		studentDTOList = studentService.find();
		
		return studentDTOList;
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public List<StudentDTO> update( StudentDTO studentDTO ) {
		
		List<StudentDTO> studentDTOList = null;

		studentService.update( studentDTO );
		studentDTOList = studentService.find();
		
		return studentDTOList;
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public List<StudentDTO> delete( StudentDTO studentDTO ) {
		
		List<StudentDTO> studentDTOList = null;

		studentService.delete( studentDTO );
		studentDTOList = studentService.find();
		
		return studentDTOList;
	}
	
}
