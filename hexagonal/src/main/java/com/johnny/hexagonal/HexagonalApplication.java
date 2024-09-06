package com.johnny.hexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@EnableFeignClients
@SpringBootApplication
@EnableFeignClients
class HexagonalApplication {

	public static void main(String[] args) {

		SpringApplication.run(HexagonalApplication.class, args);
	}

}
