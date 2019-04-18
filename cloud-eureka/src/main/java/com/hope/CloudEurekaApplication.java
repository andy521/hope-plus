package com.hope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableAutoConfiguration(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
public class CloudEurekaApplication {
    /** logger */
    private static final Logger LOGGER = LoggerFactory.getLogger(CloudEurekaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaApplication.class, args);
        LOGGER.info("=============================》");
        LOGGER.info("=============================》hope-plus-cloud-eureka 注册中心启动成功！温馨提示：代码千万行，注释第一行，命名不规范，同事泪两行");
        LOGGER.info("=============================》");
    }

}
