package com.landeros.restdemo.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.landeros.restdemo.exposition.api.dto.StudentDTO;
import com.landeros.restdemo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private static StudentDTO[] studentDTOArray = {
		new StudentDTO(1L, "Christian", "Landeros", "Alcaraz", 36, Boolean.TRUE),
		new StudentDTO(2L, "Alberto", "Garcia", "Santillan", 21, Boolean.FALSE),
		new StudentDTO(3L, "Mario", "Robles", "Lara", 30, Boolean.TRUE),
		new StudentDTO(4L, "Natalia", "Soler", "Salas", 18, Boolean.TRUE),
		new StudentDTO(5L, "Maibel", "Torres", "Salazar", 42, Boolean.FALSE),
		new StudentDTO(6L, "Julio", "Aguilar", "Becerra", 51, Boolean.TRUE),
	};
	private static List<StudentDTO> exampleStudentDTOList = Arrays.asList(studentDTOArray);
	
	@Override
	public List<StudentDTO> find() {
		
		List<StudentDTO> studentDTOList = StudentServiceImpl.exampleStudentDTOList;
		
		return studentDTOList;
	}

	@Override
	public StudentDTO get( Long id ) {
		
		StudentDTO studentDTO = null;
		
		for ( StudentDTO student : StudentServiceImpl.exampleStudentDTOList ) {
			
			if ( student.getId().equals( id ) ) {
				
				studentDTO = student;
			}
		}
		
		return studentDTO;
	}

	@Override
	public StudentDTO create(StudentDTO studentDTO) {
		
		StudentDTO createdStudentDTO = null;
		
		StudentServiceImpl.exampleStudentDTOList.add( studentDTO );
		createdStudentDTO = studentDTO;
		
		return createdStudentDTO;
	}

	@Override
	public StudentDTO update(StudentDTO studentDTO) {

		StudentDTO updatedStudentDTO = null;
		
		for ( StudentDTO student : StudentServiceImpl.exampleStudentDTOList ) {
			
			if ( student.getId().equals( studentDTO.getId() ) ) {
				
				student.setName( studentDTO.getName() );
				student.setApePat( studentDTO.getApePat() );
				student.setApeMat( studentDTO.getApeMat() );
				student.setAge( studentDTO.getAge() );
				student.setIsActive( studentDTO.getIsActive() );
			}
		}
		updatedStudentDTO = studentDTO;
		
		return updatedStudentDTO;
	}

	@Override
	public Boolean delete(StudentDTO studentDTO) {
		
		Boolean isDeleted = Boolean.FALSE;
		
		for ( StudentDTO student : StudentServiceImpl.exampleStudentDTOList ) {
			
			if ( student.getId().equals( studentDTO.getId() ) ) {
				
				StudentServiceImpl.exampleStudentDTOList.remove( student );
				isDeleted = Boolean.TRUE;
			}
		}
		
		return isDeleted;
	}

}
