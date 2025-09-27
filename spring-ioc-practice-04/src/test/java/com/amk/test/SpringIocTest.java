package com.amk.test;

import com.amk.config.JavaConfig;
import com.amk.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 阿明楷
 * @Date 2025/9/27:16:37
 * @See:
 */

public class SpringIocTest {
    @Test
    public void test(){
        ApplicationContext applicationContext =new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentController controller = applicationContext.getBean(StudentController.class);

        controller.findAll();
    }

}
