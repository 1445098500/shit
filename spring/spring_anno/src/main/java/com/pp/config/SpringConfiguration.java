package com.pp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration

@ComponentScan("com.pp")

@Import(DataSourceConfiguration.class)
public class SpringConfiguration {


}
