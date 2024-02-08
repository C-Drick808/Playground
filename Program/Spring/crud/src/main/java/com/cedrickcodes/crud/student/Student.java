package com.cedrickcodes.crud.student;

import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table
public class Student {

   @Id
   @SequenceGenerator(
      name = "student_sequence",
      sequenceName = "student_sequence",
      allocationSize = 1
   )
   @GeneratedValue(
      strategy = GenerationType.SEQUENCE,
      generator = "student_sequence"
   )
   
   private Long id;
   private String name;
   private String email;
   private LocalDate dob;
   @Transient
   private Integer age;

   public Student(){

   }

   public Student(long id, String name, String email, LocalDate dob){

      this.id = id;
      this.name = name;
      this.email = email;
      this.dob = dob;
   }

   public Student(String name, String email, LocalDate dob){

      this.name = name;
      this.email = email;
      this.dob = dob;
   }

   public long getId(){
      return id;
   }
   public void setId(long id){
      this.id = id;
   }
   public String name(){
      return name;
   }
   public void getName(String name){
      this.name = name;
   }
   public String getEmail(){
      return email;
   }
   public void setEmail(String email){
      this.email = email;
   }
   public LocalDate getDob(){
      return dob;
   }
   public void setDate(LocalDate dob){
      this.dob = dob;
   }
   public Integer getAge(){

      return Period.between(this.dob, LocalDate.now()).getYears();
   }
   public void setAge(Integer age){
      this.age = age;
   }

   @Override
   public String toString() {
      return "{" +
         " id='" + id + "'" +
         ", name='" + name + "'" +
         ", email='" + email + "'" +
         ", dob='" + dob + "'" +
         ", age='" + age + "'" +
         "}";
   }

   
   


}
