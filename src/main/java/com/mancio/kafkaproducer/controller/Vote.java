package com.mancio.kafkaproducer.controller;

import com.mancio.kafkaproducer.pojo.EmployeesRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class Vote {

    @Autowired
    KafkaTemplate<String, EmployeesRating> KafkaJsontemplate;
    String TOPIC_NAME = "rating-topic";



    @PostMapping("/vote")
    public ResponseEntity<EmployeesRating> voteEmployee(@Valid @RequestBody EmployeesRating employeesRating){
        KafkaJsontemplate.send(TOPIC_NAME, employeesRating);
        return ResponseEntity.ok().body(employeesRating);
    }
}
