package com.deliveryapp.DeliveryApp.kafkaservice;

import com.deliveryapp.DeliveryApp.AppConstants.AppConstants;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class KafkaService {

    //private static final org.slf4j.Logger log = LoggerFactory.getLogger(KafkaService.class);
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

   // public Logger logger= (Logger) LoggerFactory.getLogger(KafkaService.class);

    public boolean updatelocation(String location){
        this.kafkaTemplate.send(AppConstants.Location_Deilvery,location);
       // log.info("messagee produced");
        return true;
    }

}
