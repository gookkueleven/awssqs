package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan
public class AwssqsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwssqsApplication.class, args);
	}
}
