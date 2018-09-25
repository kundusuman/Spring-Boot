package com.sdet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com"})
@EntityScan("com.sdet.etities")
@EnableAutoConfiguration
public class Final1Application {

	public static void main(String[] args) {
		SpringApplication.run(Final1Application.class, args);
	}
}
