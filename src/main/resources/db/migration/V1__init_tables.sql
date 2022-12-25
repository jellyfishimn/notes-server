create table note
(
    id      uuid primary key,
    who     varchar(36) not null,
    time    timestamp,
    message text
);