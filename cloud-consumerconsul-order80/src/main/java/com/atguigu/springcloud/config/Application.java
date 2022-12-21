package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0
 * @description: TODO
 * @date 2022/12/21 14:21
 */
@Configuration
public class Application {
    @Bean
    @LoadBalanced   //负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
