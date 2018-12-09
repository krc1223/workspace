package com.krc.cloud.Controller;

import com.krc.cloud.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author Rongcai Kang
 * @Time 2018/12/9
 * @Description
 */
@RestController
@RequestMapping("/consumer")
public class StudentConsumerController {


    @Resource
    private RestTemplate  restTemplate;

    @GetMapping("/findById/{id}")
    public Student findById(Integer id){
       return restTemplate.getForObject("http://localhost:7001/student/user/simple/"+id,Student.class);
    }
}
