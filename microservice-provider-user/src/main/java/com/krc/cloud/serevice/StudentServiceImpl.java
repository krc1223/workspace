package com.krc.cloud.serevice;

import com.krc.cloud.dao.StudentDao;
import com.krc.cloud.entity.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @Author Rongcai Kang
 * @Time 2018/12/9
 * @Description
 */

@Service
public class StudentServiceImpl implements  StudentService{

    @Resource
    private StudentDao  studentDao;

    @Override
    public Optional<Student> findById(Integer id){
        return  studentDao.findById(id);
    }
}
