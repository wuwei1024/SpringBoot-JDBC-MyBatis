package com.wuwei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * SpringBoot入口程序
 *
 * @author 吴维
 * @date 2017-8-5 14:04:37
 */
@SpringBootApplication
@ServletComponentScan
@MapperScan(basePackages = "com.wuwei.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
