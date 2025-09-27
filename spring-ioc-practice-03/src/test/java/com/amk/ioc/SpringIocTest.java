package com.amk.ioc;

import com.amk.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 阿明楷
 * @Date 2025/9/27:09:33
 * @See:
 */
public class SpringIocTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        StudentController controller = applicationContext.getBean(StudentController.class);
        controller.findAll();
    }
}
