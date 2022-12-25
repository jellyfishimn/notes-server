package org.asap.notes_server.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.asap.notes_server.model.entity.Note;
import org.asap.notes_server.repository.NoteRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Slf4j
@RequiredArgsConstructor
public class NoteConsumer {

    private final NoteRepository noteRepository;

    @RabbitListener(queues = "notes-queue")
    public void process(final String message) {
        noteRepository.save(Note.of("anonymous", LocalDateTime.now(), message));
        log.debug("Received message from telegram-bot-server: {}", message);
    }
}
