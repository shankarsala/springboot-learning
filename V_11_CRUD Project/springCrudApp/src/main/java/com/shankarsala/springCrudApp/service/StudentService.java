package com.shankarsala.springCrudApp.service;

import com.shankarsala.springCrudApp.entity.Student;
import com.shankarsala.springCrudApp.repository.StudentRepository;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    // 1. End point listen (/app/students POST)
    // 2. Business Logic
    // 3. Interact with DB to store
    //4. Response back to client (postman)


    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq){
          // business logic
        // store to db
        System.out.println("Inside Student Service");
       Student studentResp =  studentRepository.saveStudent(studentReq);
        System.out.println("Exiting Student Service");
       return studentReq;
    }
}
