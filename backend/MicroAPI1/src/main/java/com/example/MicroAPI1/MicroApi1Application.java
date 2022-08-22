package com.example.MicroAPI1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableEurekaClient
@CrossOrigin

public class MicroApi1Application {


	public static void main(String[] args) {
		SpringApplication.run(MicroApi1Application.class, args);
	}

}
