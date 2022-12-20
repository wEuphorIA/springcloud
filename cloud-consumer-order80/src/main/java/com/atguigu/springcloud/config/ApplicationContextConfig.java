package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0
 * @description: TODO
 * @date 2022/12/19 23:51
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced //使用LoadBalanced注解赋予RestTemplate负载均衡能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
