package com.findpoop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FindPoopApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindPoopApplication.class, args);
	}

}
