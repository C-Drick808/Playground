package com.cedrickcodes.crud.student;

import java.time.LocalDate;

public class Student {
   
   private Long id;
   private String name;
   private String email;
   private LocalDate dob;
   private Integer age;

   public Student(){

   }

   public Student(long id, String name, String email, LocalDate dob, Integer age){

      this.id = id;
      this.name = name;
      this.email = email;
      this.dob = dob;
      this.age = age;
   }

   public Student(String name, String email, LocalDate dob, Integer age){

      this.name = name;
      this.email = email;
      this.dob = dob;
      this.age = age;
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
      return age;
   }
   public void setAge(Integer age){
      this.age = age;
   }

   
   


}
