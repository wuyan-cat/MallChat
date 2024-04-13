/**
 * z作者:无言
 * 版本:1.0
 * 2024-4-12 13:50
 */


package com.wuyan.mallchat.common;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication(scanBasePackages = {"com.wuyan.mallchat"})
//@MapperScan({"com.wuyan.mallchat.common.**.mapper"})
@ServletComponentScan
public class MallchatCustomApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallchatCustomApplication.class,args);
    }
}
