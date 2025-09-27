package com.amk.controller;

import com.amk.pojo.Student;
import com.amk.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author 阿明楷
 * @Date 2025/9/27:09:13
 * @See:
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;
    public void findAll(){
        List<Student> all = studentService.findAll();
        System.out.println("all"+all);

    }

}
