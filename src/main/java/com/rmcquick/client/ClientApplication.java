package com.rmcquick.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories("com.rmcquick.client.repository")
@ComponentScan({"com.rmcquick.client.controller", "com.rmcquick.client.service", "com.rmcquick.client.repository", "com.rmcquick.client.model"})
@EntityScan("com.rmcquick.client.model")
@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

}
