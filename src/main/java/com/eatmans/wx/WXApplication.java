package com.eatmans.wx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/7/5
 */
@SpringBootApplication
@MapperScan("com.eatmans.wx.mapper")
public class WXApplication {

    public static void main(String[] args) {
        SpringApplication.run(WXApplication.class, args);
    }

}
