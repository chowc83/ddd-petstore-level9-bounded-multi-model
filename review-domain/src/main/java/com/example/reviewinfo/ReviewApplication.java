package com.example.reviewinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.transaction.annotation.Transactional;
import com.example.reviewinfo.kafka.KafkaProcessor;

@SpringBootApplication
@RestController
@EnableAspectJAutoProxy
@EnableBinding(KafkaProcessor.class)
@Transactional
public class ReviewApplication {

    public static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext =
            SpringApplication.run(ReviewApplication.class, args);
    }

}