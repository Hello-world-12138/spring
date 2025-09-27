package com.amk.service;

import com.amk.pojo.Student;

import java.util.List;

/**
 * @author 阿明楷
 * @Date 2025/9/27:09:00
 * 学员的业务接口
 */
public interface StudentService {
    List<Student> findAll();
}
