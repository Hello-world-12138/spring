package com.amk.dao;

import com.amk.pojo.Student;

import java.util.List;

/**
 * @author 阿明楷
 * @Date 2025/9/27:08:51
 * 学员持久层访问接口
 */
public interface StudentDao {


    List<Student> queryAll();


}
