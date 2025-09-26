package com.amk.dao.impl;

import com.amk.dao.StudentDao;
import com.amk.pojo.Student;
import org.springframework.beans.factory.parsing.BeanEntry;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author 阿明楷
 * @Date 2025/9/26:14:53
 * @See:
 */
public class StudentDaoimpol implements StudentDao {

        private JdbcTemplate jdbcTemplate;

        public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
            this.jdbcTemplate = jdbcTemplate;
        }

    @Override
    public List<Student> queryAll() {
        String sql = "select id,name,gender,age,class as classes from students";
        List<Student> students =jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Student.class));
        System.out.println("studentDao"+students);

        return null;
    }
}
