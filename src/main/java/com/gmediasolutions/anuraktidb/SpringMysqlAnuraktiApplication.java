package com.gmediasolutions.anuraktidb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.gmediasolutions.anuraktidb")
@SpringBootApplication
public class SpringMysqlAnuraktiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMysqlAnuraktiApplication.class, args);
	}

}

