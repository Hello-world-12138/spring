package com.amk.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author 阿明楷
 * @Date 2025/10/11:09:05
 * @See:
 * 增强类的内部要存储真强代码
 */

@Component
@Aspect
public class LogAdvice {

    @Before("execution(* com.amk.service.impl.*.*(..))")
    public void start() {
        System.out.println("方法开始了");
    }
    @After("execution(* com.amk.service.impl.*.*(..))")
    public void after() {
        System.out.println("方法结束了");
    }
    @AfterThrowing("execution(* com.amk.service.impl.*.*(..))")
    public void error() {
        System.out.println("方法报错了");
    }
}
