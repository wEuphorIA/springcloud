package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @version 1.0
 * @description: TODO
 * @date 2022/12/26 19:51
 */
@SpringBootApplication
@EnableHystrixDashboard //启用Hystrix仪表板

public class HystrixDashboard9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard9001.class,args);
    }


}
