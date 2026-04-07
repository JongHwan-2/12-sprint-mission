package com.sprint.mission.discodeit.entity;

import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

@Getter
@ToString
public class Message implements Serializable {
    private UUID id;
    private String content;
    private UUID userId;
    private UUID channelId;
    private Instant createdAt;
    private Instant updatedAt;

    public UUID getId() {
        return id;
    }
    public Message(String content, UUID userId, UUID channelId) {
        this.id = UUID.randomUUID();
        this.content = content;
        this.userId = userId;
        this.channelId = channelId;
        this.createdAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    public void update(String content){
        this.content = content;
        this.updatedAt = Instant.now();
    }

}
