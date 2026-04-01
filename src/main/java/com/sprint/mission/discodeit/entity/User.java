package com.sprint.mission.discodeit.entity;

import java.io.Serializable;
import java.util.UUID;
// 도메인 모델 정의
// [O] 디스코드 서비스를 활용해보면서 각 도메인 모델에 필요한 정보를 도출하고, Java Class로 구현하세요.
// [O] 패키지명: com.sprint.mission.discodeit.entity
// [O] 도메인 모델 정의
// [ ] 공통
// [O] id: 객체를 식별하기 위한 id로 UUID 타입으로 선언합니다.
// [O] createdAt, updatedAt: 각각 객체의 생성, 수정 시간을 유닉스 타임스탬프로 나타내기 위한 필드로 Long 타입으로 선언합니다.
// [O] User
// [O] Channel
// [O] Message
// [O] 생성자
// [O] id는 생성자에서 초기화하세요.
// [O] createdAt는 생성자에서 초기화하세요.
// [O] id, createdAt, updatedAt을 제외한 필드는 생성자의 파라미터를 통해 초기화하세요.
// [O] 메소드
// [O] 각 필드를 반환하는 Getter 함수를 정의하세요.
// [O] 필드를 수정하는 update 함수를 정의하세요.

public class User implements Serializable {
    private UUID id;
    private String username;
    private String email;
    private String password;
    private String nickname;
    private Long createdAt;
    private Long updatedAt;

    public User(String username, String email, String password, String nickname) {
        id = UUID.randomUUID();
        this.username = username;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        createdAt = System.currentTimeMillis();
        updatedAt = System.currentTimeMillis();
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }


    public void update(String username, String email, String password, String nickname){
        this.username = username;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        updatedAt = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
