<h1 align="center">
  Messaging Kafka Spring Boot
</h1>

Sistema para introduzir o conceito de mensageria utilizando Spring Boot e Kafka.

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring for Kafka](https://docs.spring.io/spring-kafka/reference/html/)
- [Kafka](https://kafka.apache.org)
- [Docker Compose](https://docs.docker.com/compose/)

## Como Executar

- Adicionar /etc/hosts o hostname `kafka`.
```
$ nano /etc/hosts

127.0.0.1   localhost kafka
```

- Rodar o Kafka com o Docker Compose:
```
$ docker-compose up
```


- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/messaging-kafka-springboot.jar
```

- Enviar uma mensagem
```
$ http://localhost:8080/hello-kafka?message=Kafka%20com%20spring%20boot

HTTP/1.1 200
Content-Length: 0
Date: Wed, 09 Aug 2023 00:36:25 GMT
```

- Visualizar mensagem recebida no log:
```
Consumer Message: Kafka com spring boot
```