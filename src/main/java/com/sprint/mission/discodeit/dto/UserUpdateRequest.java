package com.sprint.mission.discodeit.dto;

public record UserUpdateRequest(
        String username,
        String email,
        String password,
        String nickname
) {
}
