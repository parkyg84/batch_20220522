package com.example.batch.batch_20220522;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class Batch20220522Application {

	public static void main(String[] args) {
		SpringApplication.run(Batch20220522Application.class, args);
	}

}
