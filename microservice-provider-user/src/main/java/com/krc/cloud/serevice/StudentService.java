package com.krc.cloud.serevice;

import com.krc.cloud.entity.Student;

import java.util.Optional;

/**
 * @Author Rongcai Kang
 * @Time 2018/12/9
 * @Description
 */
public interface StudentService {

    public Optional<Student> findById(Integer id);
}
