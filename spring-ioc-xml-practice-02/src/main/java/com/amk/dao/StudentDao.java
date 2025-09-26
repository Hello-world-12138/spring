package com.amk.dao;

import com.amk.pojo.Student;

import java.util.List;

/**
 * @author 阿明楷
 * @Date 2025/9/26:14:50
 * @See:
 */
public interface StudentDao {
    List<Student> queryAll();
}
