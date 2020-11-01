package com.example.zookser.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

    /**
     * 路径：com.example.demo.zookeeper.controller
     * 类名：
     * 功能：《用一句描述一下》
     * 备注：
     * 创建人：typ
     * 创建时间：2018/9/25 21:19
     * 修改人：
     * 修改备注：
     * 修改时间：
     */

@RequestMapping("/testController")
@RestController
public class TestController {

        @Autowired
        private KafkaTemplate kafkaTemplate;

        private static final Logger log = LoggerFactory.getLogger(TestController.class);

        private static final UUID INSTANCE_UUID = UUID.randomUUID();


        @RequestMapping("/test")
        public String test() {
            log.info("test :" + INSTANCE_UUID.toString());
            return INSTANCE_UUID.toString();
        }
        @RequestMapping("/test1")
        public void sendTest(String msg) {
            msg = "我家猫是个傻逼吧";

            kafkaTemplate.send("haha", msg);
        }

    }
