package com.krc.cloud.controller;

import com.krc.cloud.entity.Student;
import com.krc.cloud.serevice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @Author Rongcai Kang
 * @Time 2018/12/9
 * @Description
 */

@RestController
public class StudentController {

     @Autowired
     private StudentService  studentService;

     @GetMapping("/simple/{id}")
     public Optional<Student> findById(@PathVariable  Integer id)
     {
          return studentService.findById(id);
     }
}
