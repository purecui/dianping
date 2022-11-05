package com.code;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.code.mapper")
@SpringBootApplication
public class DianPingApplication {

  public static void main(String[] args) {
    SpringApplication.run(DianPingApplication.class, args);
  }

}
