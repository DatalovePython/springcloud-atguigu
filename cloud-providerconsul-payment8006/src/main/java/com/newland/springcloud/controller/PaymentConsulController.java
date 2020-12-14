package com.newland.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author luzc
 * @date 2020/12/14 15:53
 * @desc
 */

@RestController
@Slf4j
public class PaymentConsulController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String paymentzk() {
        return "springcloud with consule:" + serverPort + "\t"
                + UUID.randomUUID().toString();
    }

}
