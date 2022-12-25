package org.asap.notes_server.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class NoteConsumer {

    @RabbitListener
    public void process(final String message) {
        System.out.printf("Received from: %s ", new String(message.getBytes()));
    }
}
