package com.sprint.mission.discodeit.entity;

import lombok.Getter;
import lombok.ToString;

import java.time.Instant;
import java.util.UUID;

@Getter
@ToString
public class BinaryContent {
    private UUID id;
    private UUID userId;
    private UUID messsageId;
    private byte[] binaryData;
    private Instant createdAt;

    public BinaryContent(UUID userId, UUID messsageId, byte[] binaryData) {
        this.id = UUID.randomUUID();
        this.userId = userId;
        this.messsageId = messsageId;
        this.binaryData = binaryData;
        this.createdAt = Instant.now();
    }
}
