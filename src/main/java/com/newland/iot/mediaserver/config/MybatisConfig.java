package com.newland.iot.mediaserver.config;


import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.newland.iot.mediaserver.dao")
public class MybatisConfig {

}
