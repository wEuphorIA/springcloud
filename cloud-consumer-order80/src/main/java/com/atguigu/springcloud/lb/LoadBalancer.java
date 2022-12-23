package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBalancer {

    //传入具体实例的集合，返回选中的实例
    ServiceInstance instances(List<ServiceInstance> serviceInstance);

}
