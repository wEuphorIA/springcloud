package com.atguigu.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0
 * @description: TODO
 * @date 2023/1/4 21:58
 */
@MapperScan("com.atguigu.springcloud.Dao")
@Configuration
public class MybatisConfig {
}
