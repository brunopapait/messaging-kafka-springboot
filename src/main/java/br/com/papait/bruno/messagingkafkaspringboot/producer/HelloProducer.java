package br.com.papait.bruno.messagingkafkaspringboot.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class HelloProducer {
  private KafkaTemplate<String, String> kafkaTemplate;

  public HelloProducer(KafkaTemplate<String, String> kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }

  public void sendMessage(String messageText) {
      this.kafkaTemplate.send("hello-topic", messageText);
  }
}
