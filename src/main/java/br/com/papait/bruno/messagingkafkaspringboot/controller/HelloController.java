package br.com.papait.bruno.messagingkafkaspringboot.controller;

import br.com.papait.bruno.messagingkafkaspringboot.producer.HelloProducer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello-kafka")
public class HelloController {

  private HelloProducer helloProducer;

  public HelloController(HelloProducer helloProducer) {
    this.helloProducer = helloProducer;
  }

  @GetMapping
  public ResponseEntity<Void> sendMessage(@RequestParam String message) {
    this.helloProducer.sendMessage(message);
    return ResponseEntity.status(HttpStatus.OK).build();
  }
}
