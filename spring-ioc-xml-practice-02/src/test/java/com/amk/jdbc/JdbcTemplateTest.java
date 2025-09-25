package com.amk.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.amk.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DataSourceUtils;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author 阿明楷
 * @Date 2025/9/25:17:46
 * @See:
 */
public class JdbcTemplateTest {
    public void testForJava() {
        //0.创建一个连接池对象
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql:///studb");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        //1.实例化对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate();

        jdbcTemplate.setDataSource(dataSource);
        //2.调用方法

    }

    @Test
    public void testForIoc(){
        //1.创建ioc容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-01.xml");
        //2.获取jdbcTemplate组件
        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);

        //3.进行数据库curd动作

        //3.1插入 删除 和 修改 DML update
        String sql ="insert into students (id,name,gender,age,class) values (?,?,?,?,?)";
        int rows=jdbcTemplate.update(sql,9 ,"二狗子","男",18,"三年二班");
        System.out.println("rows = " +rows);

        //3.2查询单条数据
        sql="select * from students where id=? ";
        Student student1 =jdbcTemplate.queryForObject(sql, ( rs, rowNum) -> {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setGender(rs.getString("gender"));
                student.setAge(rs.getInt("age"));
                student.setClasses(rs.getString("class"));

                return student;

        },1);
        System.out.println("student1="+student1);

        //3.3查询所有学生数据
        sql="select id,name,gender,age,class as classes from students ; ";
       List<Student>studentList= jdbcTemplate.query(sql,new BeanPropertyRowMapper<Student>(Student.class));
       System.out.println("studentList="+studentList);
    }
}
