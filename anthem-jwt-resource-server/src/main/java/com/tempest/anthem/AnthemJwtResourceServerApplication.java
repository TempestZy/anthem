package com.tempest.anthem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring security startup class
 *
 * @author tempest_zy
 * @date 2021-08-31
 */
@SpringBootApplication
public class AnthemJwtResourceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnthemJwtResourceServerApplication.class, args);
    }

}
