package com.joshcode.kafkaexample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaexampleApplication.class, args);
	}

	// To Test, will change to be RESTful, Sent a Message or a Stream to Kafka
	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
		return args -> {
			for (int i = 0; i < 100; i++) {
				kafkaTemplate.send("joshcode", "Hello Kafka :) " + i);
			}	
		};
	}

}
