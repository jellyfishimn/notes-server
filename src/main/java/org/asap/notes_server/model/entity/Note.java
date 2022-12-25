package org.asap.notes_server.model.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Note extends BaseEntity {

    private String description;
}
