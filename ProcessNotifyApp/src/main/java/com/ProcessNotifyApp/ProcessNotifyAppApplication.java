package com.ProcessNotifyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.ProcessNotifyApp.repository")

public class ProcessNotifyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessNotifyAppApplication.class, args);
	}

}
