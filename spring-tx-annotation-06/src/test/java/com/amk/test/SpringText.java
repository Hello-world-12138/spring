package com.amk.test;

import com.amk.config.JavaConfig;
import com.amk.dao.StudentDao;
import com.amk.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author 阿明楷
 * @Date 2025/10/12:16:08
 * @See:
 */
@SpringJUnitConfig(JavaConfig.class)
public class SpringText{

    @Autowired
    private StudentService studentService;

    @Test
    public void text(){
        studentService.changeInfo();
    }


}
