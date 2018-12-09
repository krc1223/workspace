package com.krc.cloud.serevice;

import com.krc.cloud.entity.Student;

/**
 * @Author Rongcai Kang
 * @Time 2018/12/9
 * @Description
 */
public interface StudentService {

    public Student findById(Integer id);
}
