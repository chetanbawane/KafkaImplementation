package com.deliveryapp.DeliveryApp.controller;

import com.deliveryapp.DeliveryApp.kafkaservice.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LocationController {

    @Autowired
    private KafkaService kafkaService;

        @PostMapping ("/update")
        public ResponseEntity<?> updatelocation(){
            this.kafkaService.updatelocation("current location bhadrawati");
            return new ResponseEntity<>(Map.of("message","update location"), HttpStatus.OK);
        }
}
