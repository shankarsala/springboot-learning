package com.shankarsala.springCrudApp.repository;


import com.shankarsala.springCrudApp.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {

    public Student saveStudent(Student studentReq){
        // save to DB.
        System.out.println("Inside Student Repository");
        System.out.println("Exiting Student Repository");
        Student s1 = new Student();
        s1.setName("Shankar");
        s1.setAge(22);
        s1.setEmail("shankar@gmail.com");
        s1.setSubject("CSE");
        s1.setRollNo(43);

        return  s1;
    }
}
