package org.asap.notes_server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@EnableRabbit
@SpringBootApplication
public class NotesServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotesServerApplication.class, args);
    }
}
