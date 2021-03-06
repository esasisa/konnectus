package com.konnectus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.MongoClient;

@Configuration
public class MongoConfig {
    @Bean
    public MongoClient createConnection() {
        return new MongoClient("localhost:27017");
    }
}
