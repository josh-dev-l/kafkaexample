package com.joshcode.kafkaexample.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    //Config to define the topic in Kafka
    public NewTopic joshcodeTopic() {
        return TopicBuilder.name("joshcode")
                .build();
    }
}
