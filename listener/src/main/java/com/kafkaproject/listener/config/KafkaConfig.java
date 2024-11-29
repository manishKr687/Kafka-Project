package com.kafkaproject.listener.config;
import com.kafkaproject.listener.config.AppConstant;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {
    @KafkaListener(topics = AppConstant.LOCATION_UPDATE_TOPIC, groupId = AppConstant.GROUP_ID)
    public void locationListener(String value){
        System.out.println(value);
    }
}
