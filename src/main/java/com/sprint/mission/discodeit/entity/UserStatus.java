package com.sprint.mission.discodeit.entity;

import lombok.Getter;
import lombok.ToString;

import java.time.Instant;
import java.util.UUID;

@Getter
@ToString
public class UserStatus {
    private UUID id;
    private UUID userId;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant lastSeenAt;

    public UserStatus(UUID userId) {
        this.id = UUID.randomUUID();
        this.userId = userId;
        this.createdAt = Instant.now();
        this.updatedAt = Instant.now();
        this.lastSeenAt = Instant.now();
    }

    public void updateLastSeenAt() {
        this.lastSeenAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    public boolean isOnline() {
        return lastSeenAt.isAfter(Instant.now().minusSeconds(300));
    }
}
