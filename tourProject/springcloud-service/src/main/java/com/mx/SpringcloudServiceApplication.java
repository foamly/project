package com.mx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.mx")
@EnableEurekaClient
@MapperScan(value = "com.mx.mapper")
public class SpringcloudServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServiceApplication.class, args);
    }

}
