package com.rmcquick.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages = {"com.rmcquick.client.repository", "com.rmcquick.client.model", "com.rmcquick.client.controller", "com.rmcquick.client.repository", "com.rmcquick.client.service"})
@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

}
