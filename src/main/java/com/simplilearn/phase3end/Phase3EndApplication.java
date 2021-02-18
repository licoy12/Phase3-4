package com.simplilearn.phase3end;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.simplilearn.phase3end.repository.UserEntityRepository;

@Configuration
@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserEntityRepository.class)
@EnableAutoConfiguration
public class Phase3EndApplication {

	public static void main(String[] args) {
		SpringApplication.run(Phase3EndApplication.class, args);
	}

}