package com.redhat.longrunning.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.redhat.longrunning.model.EventMessage;


@RestController
public class Controller {
	
	@Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/pause-container")
    public ResponseEntity<Void> produce(@RequestBody EventMessage eventMessage){
    	
        kafkaTemplate.send("pause_container_topic", eventMessage.getMessage());

        return ResponseEntity.noContent().build();
    }

}
