package com.krc.cloud.dao;

import com.krc.cloud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Author Rongcai Kang
 * @Time 2018/12/9
 * @Description
 */
public interface StudentDao extends JpaRepository<Student, Integer>,JpaSpecificationExecutor<Student> {
}
