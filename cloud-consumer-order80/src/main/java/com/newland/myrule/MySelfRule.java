package com.newland.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author luzc
 * @date 2020/12/15 11:05
 * @desc 根据ribbon 官网定义，不能将ribbon放置在componentScan扫描范围下，不然会被所有ribbon客户端共享
 * 达不到特殊化定制的目的
 */

@Configuration
public class MySelfRule {

    @Bean
    public IRule muRule(){
        // 定义为随机算法
        return new RandomRule();
    }
}
