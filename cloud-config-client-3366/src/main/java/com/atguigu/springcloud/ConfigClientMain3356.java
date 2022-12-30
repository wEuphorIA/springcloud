package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @version 1.0
 * @description: TODO
 * @date 2022/12/30 18:00
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3356 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3356.class,args);
    }
}
