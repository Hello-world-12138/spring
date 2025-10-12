package com.amk.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;

/**
 * @author 阿明楷
 * @Date 2025/10/12:15:52
 * @See:
 */
@Configuration
@ComponentScan("com.amk")
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement//开启事务注解的支持
public class JavaConfig {

    @Value("${amk.driver}")
    private String driver;
    @Value("${amk.url}")
    private String url;
    @Value("${amk.username}")
    private String username;
    @Value("${amk.password}")
    private String password;

    //druid连接池
    @Bean
    public DataSource dataSource() {

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;


    }

    //jdbcTemplate
@Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;

    }


    @Bean
    public TransactionManager transactionManager(DataSource dataSource) {
        //内部要进行事务的操作，基于连接池
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager(dataSource);
        //需要连接池对象
        dataSourceTransactionManager.setDataSource(dataSource);

        return dataSourceTransactionManager;
    }
}
