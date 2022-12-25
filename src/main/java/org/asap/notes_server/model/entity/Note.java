package org.asap.notes_server.model.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
public class Note extends BaseEntity {

    private String who;

    private LocalDateTime time;

    private String message;
}
