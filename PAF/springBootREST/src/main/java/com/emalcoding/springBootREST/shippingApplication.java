package com.emalcoding.springBootREST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class shippingApplication {

	public static void main(String[] args) {
		SpringApplication.run(shippingApplication.class, args);

	}

}
