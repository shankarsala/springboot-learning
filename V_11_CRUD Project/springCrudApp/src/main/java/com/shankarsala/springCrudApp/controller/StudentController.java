package com.shankarsala.springCrudApp.controller;

import com.shankarsala.springCrudApp.entity.Student;
import com.shankarsala.springCrudApp.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    //CRUD Operation
    //POST(create) localhost:8080/student

    //@Component
   //Create Bean for IOC Container

    //GET(read) student

    //PUT(update) student

    //Delete(delete) student

create--> POST --> /api/students/create
Read one --> GET --> /api/students/get/{id}
Read All --> GET --> /api/students/getAll
Update --> PUT --> /api/students/update/{id}
Delete -> Delete -> /api/students/delete/{id}
 */




@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        System.out.println("Inside Student Controller");
        System.out.println(student.getName());
        System.out.println(student.getEmail());

        Student createdStudent = studentService.createStudent(student);
        System.out.println("Exiting Student Controller");
       // return "Student Created";
        return  ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdStudent);
    }
}
