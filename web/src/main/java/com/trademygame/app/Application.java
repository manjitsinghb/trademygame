package com.trademygame.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.websocket.server.ServerEndpoint;

/**
 * Created by manjtsingh on 8/24/2016.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.trademygame.*")
public class Application {

    public static void main(String[] args)
    {
        SpringApplication.run(Application.class,args);
    }

}
