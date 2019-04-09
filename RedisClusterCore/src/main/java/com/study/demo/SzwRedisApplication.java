package com.study.demo;
/**
 * @author zhu_f  E-mail: zhu_fujian@163.com
 * @version 创建时间：2019年4月9日 下午4:42:50
 * 类说明
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SzwRedisApplication {
    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(SzwRedisApplication.class, args);
    }
}