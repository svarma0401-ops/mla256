package com.test.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.config.DBConfig;
import com.test.service.PlayerService;

public class PlayerMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);

        PlayerService service = context.getBean(PlayerService.class);

        service.getFinalTeam().forEach(System.out::println);
    }
}
