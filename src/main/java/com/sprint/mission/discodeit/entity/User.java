package com.sprint.mission.discodeit.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

@Getter
@ToString
@Builder
public class User implements Serializable {
    private UUID id;
    private String username;
    private String email;
    private String password;
    private String nickname;
    private Instant createdAt;
    private Instant updatedAt;

    public User(String username, String email, String password, String nickname) {
        this.id = UUID.randomUUID();
        this.username = username;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.createdAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    public void update(String username, String email, String password, String nickname) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.updatedAt = Instant.now();
    }
}