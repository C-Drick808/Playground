package com.cedrickcodes.crud.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * StudentService
 */
public class StudentService {

   @GetMapping
	public List<Student> getStudents(){
		return List.of(
			new Student(
				1L,
				"Cedrick John Barrera",
				"cedbarrera05@gmail.com",
				LocalDate.of(2001, Month.JULY, 5),
				22
			)
		);
	}

   
}