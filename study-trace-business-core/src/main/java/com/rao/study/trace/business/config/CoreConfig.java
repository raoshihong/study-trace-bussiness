package com.rao.study.trace.business.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@MapperScan(basePackages = {"com.rao.study.trace.business.mapper"})
@ComponentScan(basePackages = {"com.rao.study.trace.lib"})
@EnableAspectJAutoProxy
public class CoreConfig {
}
