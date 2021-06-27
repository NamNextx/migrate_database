package com.nextx.springbatch.datasource;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class BatchDataSourceConfig {

    @Value("${}")
    private String srcUserName;

    @Value("${}")
    private String srcPassword;

    @Value("${}")
    private String srcJdbcUrl;

    @Value("${}")
    private String srcDriver;

    @Bean(name = "srcDataSource")
    public DataSource srcDateSource() {
        return DataSourceBuilder.create()
                .username(srcUserName)
                .password(srcPassword)
                .url(srcJdbcUrl)
                .driverClassName(srcDriver)
                .build();
    }
}
