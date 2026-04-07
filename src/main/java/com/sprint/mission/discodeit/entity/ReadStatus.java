package com.sprint.mission.discodeit.entity;

import lombok.Getter;
import lombok.ToString;

import java.time.Instant;
import java.util.UUID;

@Getter
@ToString
public class ReadStatus {
    private UUID id;
    private UUID userId;
    private UUID channelId;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant lastReadAt;

    public ReadStatus(UUID userId, UUID channelId) {
        this.id = UUID.randomUUID();
        this.userId = userId;
        this.channelId = channelId;
        this.createdAt = Instant.now();
        this.updatedAt = Instant.now();
        this.lastReadAt = Instant.now();
    }

    public void updateLastReadAt() {
        this.lastReadAt = Instant.now();
        this.updatedAt = Instant.now();

    }



}
