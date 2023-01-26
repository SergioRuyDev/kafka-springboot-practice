package com.sergioruy.kafkaspringbootpractice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic sergioruyTopic() {
        return TopicBuilder.name("sergioruy")
                .build(); //don't need use .partitions()
    }
}
