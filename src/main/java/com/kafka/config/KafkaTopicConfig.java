package com.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic softwareDevelopmentTopic() {
        return TopicBuilder
                .name("software-development")
                .partitions(1)
                .replicas(1)
                .build();
    }
    
    @Bean
    public NewTopic softwareDevelopmentTopic1() {
        return TopicBuilder
                .name("alert-message-json")
                .partitions(1)
                .replicas(1)
                .build();
    }
}
