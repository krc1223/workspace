package com.krc.cloud.controller;

import com.krc.cloud.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

/**
 * @Author Rongcai Kang
 * @Time 2018/12/9
 * @Description
 */

@RestController
public class StudentController {

     @Autowired
     private RestTemplate restTemplate;

     @GetMapping("/simple/{id}")
     public Student findById(@PathVariable  Integer id)
     {
          return restTemplate.getForObject("http://localhost:7001/user/simple/"+id,Student.class);
     }
}
