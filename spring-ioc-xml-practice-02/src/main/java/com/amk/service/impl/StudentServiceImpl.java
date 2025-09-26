package com.amk.service.impl;

import com.amk.dao.StudentDao;
import com.amk.pojo.Student;
import com.amk.service.StudentService;

import java.util.List;

/**
 * @author 阿明楷
 * @Date 2025/9/26:15:05
 * @See:
 */
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao ;
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public List<Student> findAll(){
        List<Student> studentList=studentDao.queryAll();

        System.out.println("studentService"+studentList);
        return studentList;

    }
}
