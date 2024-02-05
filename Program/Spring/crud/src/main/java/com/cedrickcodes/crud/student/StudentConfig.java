package com.cedrickcodes.crud.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

   @Bean
   CommandLineRunner commandLineRunner(StudentRepository studentRepository){
      return args ->{
         Student Ako = new Student(
				1L,
				"Cedrick John Barrera",
				"cedbarrera05@gmail.com",
				LocalDate.of(2001, Month.JULY, 5)
            );
            Student Ja = new Student(
               "Ja Morant",
               "jamorant@gmail.com",
               LocalDate.of(1996, Month.DECEMBER, 20)
            );

           studentRepository.saveAll(
               List.of(Ako,Ja)
           );
      };
   }
   
}
