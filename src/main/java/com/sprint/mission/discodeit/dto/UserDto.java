package com.sprint.mission.discodeit.dto;

import com.sprint.mission.discodeit.entity.User;

import java.time.Instant;
import java.util.UUID;

public record UserDto(
        UUID id,
        String username,
        String email,
        String nickname,
        boolean online,
        Instant createdAt,
        Instant updatedAt
) {
    public static UserDto from(User user, boolean online) {
        return new UserDto(
                user.getId(),
                user.getUsername(),
                user.getEmail(),
                user.getNickname(),
                online,
                user.getCreatedAt(),
                user.getUpdatedAt()
        );
    }
}