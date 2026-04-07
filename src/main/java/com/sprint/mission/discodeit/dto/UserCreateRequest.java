package com.sprint.mission.discodeit.dto;

import com.sprint.mission.discodeit.entity.User;

import java.time.Instant;
import java.util.UUID;

public record UserCreateRequest (
    String username,
    String email,
    String password,
    String nickname
) {
    public User toUser() {
//        return User.builder()
//                .id(UUID.randomUUID())
//                .username(username)
//                .email(email)
//                .password(password)
//                .nickname(nickname)
//                .createdAt(Instant.now())
//                .updatedAt(Instant.now())
//                .build();

        return new User(username, email, password ,nickname);
    }
}
