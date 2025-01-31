package com.deliveryapp.DeliveryApp.configKafka;

import com.deliveryapp.DeliveryApp.AppConstants.AppConstants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
public class ConfigKafka {

    @Bean
    public NewTopic newTopic(){

        return TopicBuilder.name(AppConstants.Location_Deilvery).build();
    }
}
