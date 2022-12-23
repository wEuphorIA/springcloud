package com.atguigu.springvloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author wyk
 * @version 1.0
 * @description: TODO
 * @date 2022/12/23 18:05
 */
//Feign封装了Ribbon和RestTemplate，实现负载均衡和发送请求
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")    //作为feign的接口，找CLOUD-PAYMENT-SERVICE服务
public interface PaymentFeignService {
    //直接复制8001的方法
    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping("/payment/feign/timeout")
    String paymentFeignTimeout();

}
