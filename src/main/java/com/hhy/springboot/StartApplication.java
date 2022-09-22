package com.hhy.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class StartApplication {

    private static Logger logger = LoggerFactory.getLogger(StartApplication.class);



    public static void main(String[] args) {
        logger.info("Springboot项目开始启动！");
      //  SpringApplication.run(StartApplication.class);
        SpringApplication springApplication = new SpringApplication(StartApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run();
    }
}
