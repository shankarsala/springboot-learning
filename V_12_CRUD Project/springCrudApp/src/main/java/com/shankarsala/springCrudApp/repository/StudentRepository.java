package com.shankarsala.springCrudApp.repository;


import com.shankarsala.springCrudApp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;



public interface StudentRepository extends JpaRepository<Student, Long>  {

}
