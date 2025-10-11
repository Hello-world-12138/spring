package com.amk.test;

import com.amk.config.JavaConfig;
import com.amk.service.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author 阿明楷
 * @Date 2025/10/11:08:45
 * @See:
 */
@SpringJUnitConfig(value= JavaConfig.class)
public class SpringAopTest {
    @Autowired
    private Calculator calculator;

    @Test
    public void test(){
        int add = calculator.add(1,2);
        System.out.println("add="+add);
    }

}
