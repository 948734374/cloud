package com.example.zookser.demo.common;


import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EhrAgreementListener {


    @Value("${Mediate.groupId}")
    private Object groupId;

    @KafkaListener(topics = {"'${Mediate.topic}'"}, groupId = "${Mediate.groupId}")
    public void annul1(ConsumerRecord<String, String> record) {


        log.info("groupId = myContainer1, message = " + record.toString());
    }

/*
    @KafkaListener(topics = {"test"}, groupId = "myContainer2")
    public void signed2(ConsumerRecord<String, String> record) {
        log.info("groupId = myContainer2, message = " + record.toString());
    }
*/


}
