package com.varxyz.jvx330.jdbc.example5;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DataSource.class)
@ComponentScan(basePackages = "com.varxyz.jvx330.jdbc.example5")
public class Example5Config {

}
