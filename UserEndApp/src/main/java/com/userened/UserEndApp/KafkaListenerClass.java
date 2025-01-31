package com.userened.UserEndApp;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaListenerClass {

    @KafkaListener(topics = "location-update-delivery", groupId = "group_1")
    public void updatedLocationRecived(String value){

        System.out.println(value);
    }
}
