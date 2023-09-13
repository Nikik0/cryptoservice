package com.nikik0.apiRequester.service;

import com.nikik0.apiRequester.config.KafkaProducerProperties;
import com.nikik0.apiRequester.dtos.KafkaMessageDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaSenderService {
    private final KafkaProducerProperties producerProperties;
    private final KafkaTemplate<String, KafkaMessageDto> template;

    public void send(KafkaMessageDto messageDto){
        template.send(producerProperties.getTopicName(), messageDto)
                .whenComplete((msg, exception) -> {
                    if (exception != null) {
                        log.error("Error {} occurred while sending message with id {}", exception, messageDto.getId());
                        //todo(nikik0) send msg to retry queue
                    } else {
                        log.info("Successfully sent msg with id {}, offset was ", messageDto.getId());
                    }
                });
    }
}
