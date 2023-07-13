package com.bendizhengdao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //表明为eurekaServer
public class MicroserviceEurekaConsumerMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceEurekaConsumerMovieApplication.class, args);
	}

}
