package com.example.modulith.module1.internal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.http.HttpClient;

@Configuration
public class Module1Config {

    @Bean
    public HttpClient client1() {
        HttpClient client1 = HttpClient.newHttpClient();
        System.out.println("Creating first time http client1 " + client1);
        return client1;
    }

    @Bean
    public HttpClient client2() {
        HttpClient client2 = HttpClient.newHttpClient();
        System.out.println("Creating first time http client2 " + client2);
        return client2;
    }
}
