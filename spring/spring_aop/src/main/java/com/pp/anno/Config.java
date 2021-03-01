package com.pp.anno;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration

@ComponentScan("com.pp.anno")
@EnableAspectJAutoProxy
public class Config {
}
