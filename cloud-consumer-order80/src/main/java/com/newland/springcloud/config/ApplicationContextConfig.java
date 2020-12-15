package com.newland.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author luzc
 * @date 2020/12/6 17:52
 * @desc
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    // 提供负载均衡的能力，单机版没有问题，因为只有一个服务吗名称对应一个地址，集群版需要做负载
    // 赋予restTemplate 负载的能力
    // 默认是轮询，即一个服务负载一次
    // 测试自建负载均衡算法
//    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


}
