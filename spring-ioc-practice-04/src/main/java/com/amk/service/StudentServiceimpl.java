package com.amk.service;

import com.amk.dao.StudentDao;
import com.amk.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 阿明楷
 * @Date 2025/9/27:09:01
 * @See:
 */
@Service
public class StudentServiceimpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> findAll() {

        List<Student> studentList = studentDao.queryAll();
        return studentList;
    }
}
