package com.demon.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


/**
 * springboot程序入口
 *
 * @author ChenHao
 * @date 2020/10/19
 */
@SpringBootApplication
@MapperScan("com.demon.api.mapper")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
