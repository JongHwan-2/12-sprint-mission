package com.sprint.mission.discodeit.entity;

import java.io.Serializable;
import java.util.UUID;

public class Message implements Serializable {
    private UUID id;
    private String content;
    private UUID userId;
    private UUID channelId;
    private Long createdAt;
    private Long updatedAt;

    public UUID getId() {
        return id;
    }
    public Message(String content, UUID userId, UUID channelId) {
        this.id = UUID.randomUUID();
        this.content = content;
        this.userId = userId;
        this.channelId = channelId;
        this.createdAt = System.currentTimeMillis();
        this.updatedAt = System.currentTimeMillis();
    }

    public String getContent() {
        return content;
    }

    public UUID getUserId() {
        return userId;
    }

    public UUID getChannelId() {
        return channelId;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void update(String content){
        this.content = content;
        this.updatedAt = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                ", channelId=" + channelId +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
