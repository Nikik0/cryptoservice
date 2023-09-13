package com.nikik0.apiRequester.config;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
public class KafkaProducerProperties {
    @Value("${application.kafka.topic-name}")
    private final String topicName = "demo-topic";
}
