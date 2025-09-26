package com.amk.controller;

import com.amk.pojo.Student;
import com.amk.service.StudentService;
import com.amk.service.impl.StudentServiceImpl;

import java.util.List;

/**
 * @author 阿明楷
 * @Date 2025/9/26:15:17
 * @See:
 */
public class StudentController {
    public StudentService studentService;
    public void setStudentService(StudentService studentService){
        this.studentService=studentService;
    }
    public void findAll(){
        List<Student> all=studentService.findAll();
        System.out.println("最终学员的数据"+all);
    }
}
