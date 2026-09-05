package com.shankarsala.springCrudApp.service;

import com.shankarsala.springCrudApp.entity.Student;
import com.shankarsala.springCrudApp.repository.StudentRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

       Student studentResp =  studentRepository.save(studentReq);
       return studentResp;
    }

    public Student getStudent(Long id){
        //optional means student ho sakta hai nahi tho nahi
        Optional<Student> studentResp = studentRepository.findById(id);

        if(studentResp.isPresent()){
            return  studentResp.get();
        }

        return  null;
    }

    public List<Student> getAllStudent(){
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }

    public Student updateStudent(Long id, Student studentReq){
        Optional<Student> exisitingStudent = studentRepository.findById(id);

        if(exisitingStudent.isEmpty() ){
         return null;
        }

        Student studentToSave = exisitingStudent.get();
        studentToSave.setName(studentReq.getName());
        studentToSave.setRollNo(studentReq.getRollNo());
        studentToSave.setSubject(studentReq.getSubject());
        studentToSave.setEmail(studentReq.getEmail());
        studentToSave.setAge(studentReq.getAge());

        return  studentRepository.save(studentToSave);
    }


    public Boolean deleteStudent(Long id){
        Boolean isStudent = studentRepository.existsById(id);
        if(!isStudent) return  false;
        studentRepository.deleteById(id);
        return true;
    }

}
