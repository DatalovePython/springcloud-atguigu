package com.newland.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luzc
 * @date 2020/12/25 14:27
 * @desc
 */
@RestController
// 实现刷新功能，但是该刷新功能需要激活
// curl -X POST “http://localhost:3355/actuator/refresh”
@RefreshScope
public class ConfigClientController {

    // 因为config仓库以rest形式暴露，所以所有客户端都可以通过config服务端访问到github上对应的文件信息
    @Value("${config.info}")
    private String configInfo;

    @Value("${server.port}")
    private String serverPort;

    // 正常情况下，需要重启，才能从github拉最新的配置。中心是页面刷新就能自动拉取最新数据，该服务需要重启才行。

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return "serverPort: " + serverPort + "\t\n\n configInfo" + configInfo;
    }
}
