package com.amk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 阿明楷
 * @Date 2025/10/11:08:43
 * @See:
 */
@Configuration
@ComponentScan("com.amk")
@EnableAspectJAutoProxy//开启aspectj的注解
public class JavaConfig {

}
