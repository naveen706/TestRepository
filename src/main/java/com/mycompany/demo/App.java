package com.mycompany.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;

/**
 * This example demonstrates serving up REST payloads encoded using Google Protocol Buffers.
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        System.out.println("Test Project.....!");
        SpringApplication.run(App.class, args);
    }

    @Bean
    ProtobufHttpMessageConverter protobufHttpMessageConverter() {
        return new ProtobufHttpMessageConverter();
    }

    @Bean
    PlayerRepository playerRepository() {
        return new PlayerRepositoryDemoImpl();
    }
}
