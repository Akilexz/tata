package com.ec.tata.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan(basePackages = { "com.ec.tata" })
@EnableJpaRepositories(basePackages = { "com.ec.tata" })
@ComponentScan(basePackages = { "com.ec.tata" })
@EnableTransactionManagement
public class BaseConfiguration {
}
