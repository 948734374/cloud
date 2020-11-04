package zookcli.demo.common;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumer {
    @KafkaListener(topics = {"test"}, groupId = "myContainer1")
    public void annul1(ConsumerRecord<String, String> record) {
        log.info("groupId = myContainer1, message = " + record.toString());
        String  recv =record.value();

        System.out.println("<<<<<<<<<<<<<<<<<<收到消息："+recv);
    }

    @KafkaListener(topics = {"test"}, groupId = "myContainer2")
    public void signed2(ConsumerRecord<String, String> record) {
        log.info("groupId = myContainer2, message = " + record.toString());

        String  recv =record.value();

        System.out.println("<<<<<<<<<<<<<<<<<<收到消息："+recv);
    }
}


