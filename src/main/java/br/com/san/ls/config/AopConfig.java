package br.com.san.ls.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "br.com.san.ls")
@EnableAspectJAutoProxy
public class AopConfig {

}
