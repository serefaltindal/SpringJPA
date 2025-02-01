package com.altindal.SpringJPA.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import jakarta.persistence.Entity;

@SpringBootApplication
@EntityScan(basePackages = {"com.altindal"})
@ComponentScan(basePackages = {"com.altindal"})
@EnableJpaRepositories(basePackages = {"com.altindal"})
public class SpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

}
